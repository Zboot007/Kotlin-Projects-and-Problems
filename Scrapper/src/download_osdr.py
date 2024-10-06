import requests
import json
from typing import List, Dict, Any

BASE_URL = "https://osdr.nasa.gov/osdr/data/osd/files/{OSD_STUDY_IDs}"


def fetch_data(study_ids: List[str], results_per_page: int = 100, all_files: bool = True) -> List[Dict[str, Any]]:
    all_data = []
    current_page = 1

    while True:
        url = f"{BASE_URL}?page={current_page}&size={results_per_page}&all_files={str(all_files).lower()}"
        url = url.format(OSD_STUDY_IDs=",".join(study_ids))

        print(f"Fetching URL: {url}")
        response = requests.get(url)

        if response.status_code != 200:
            print(f"Error fetching data: HTTP {response.status_code}")
            print(f"Response content: {response.text}")
            break

        try:
            data = response.json()
            print(f"Response structure: {json.dumps(data, indent=2)}")
        except json.JSONDecodeError:
            print("Failed to decode JSON response")
            print(f"Response content: {response.text}")
            break

        if isinstance(data, list):
            all_data.extend(data)
        elif isinstance(data, dict):
            if 'content' in data:
                all_data.extend(data['content'])
            else:
                print("Unexpected response structure. 'content' key not found.")
                print(f"Available keys: {', '.join(data.keys())}")
                # Append the entire response as a single item
                all_data.append(data)
        else:
            print(f"Unexpected data type: {type(data)}")
            break

        # Check if we've reached the end of the data
        if isinstance(data, dict) and 'totalPages' in data:
            if current_page >= data['totalPages']:
                break
        else:
            # If we can't determine pagination, just process one page
            break

        current_page += 1

    return all_data


def save_data_to_file(data: List[Dict[str, Any]], filename: str):
    with open(filename, 'w') as f:
        json.dump(data, f, indent=2)


def main():
    # Replace with actual study IDs
    study_ids = ["379", "665"]
    results_per_page = 100
    all_files = True

    print("Fetching data from NASA OSDR...")
    data = fetch_data(study_ids, results_per_page, all_files)
    print(f"Retrieved {len(data)} items.")

    output_file = "nasa_osdr_data.json"
    save_data_to_file(data, output_file)
    print(f"Data saved to {output_file}")


if __name__ == "__main__":
    main()
