fun createPult(): Map<String, () -> Unit> {
    var channel = 0
    var volume = 1
    var onOff = false // if false then off if true then on
    var mute = true  // if false then off if true then on
    return mapOf(
        "display" to {
            println("Tv => ${if(onOff) "вкл" else "выкл"}")
            println("Mute => ${if (mute) "вкл" else "выкл"}")
            println("Channel => $channel")
            println("Volume => $volume\n")
        },
        "up" to {
            if(onOff) {
                if (channel == 5)
                    channel = 0
                else
                    channel += 1
            }
        },
        "down" to {
            if(onOff) {
                if (channel == 0)
                    channel = 5
                else
                    channel -= 1
            }
        },
        "volumeUp" to {
            if(onOff) {
                if (volume == 5)
                    volume = 5
                else
                    volume += 1
            }
        },
        "volumeDown" to {
            if(onOff) {
                if (volume == 0)
                    volume = 0
                else
                    volume -= 1
            }
        },
        "mute" to {
            if(onOff) {
                mute = if (mute) false else true
            }
        },
        "onOff" to {
            if(onOff) {
                onOff = if (onOff) false else true
            }
        }
    )
}
fun main() {
    val pult = createPult()

    pult["display"]!!()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 0
    // Volume => 1

    pult["up"]!!()
    pult["up"]!!()
    pult["up"]!!()
    pult["up"]!!()
    pult["up"]!!()
    pult["up"]!!()
    pult["up"]!!()
    pult["up"]!!()
    pult["up"]!!()
    pult["down"]!!()
    pult["down"]!!()

    pult["display"]!!()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 1
    // Volume => 1

    pult["volumeUp"]!!()
    pult["volumeUp"]!!()
    pult["volumeUp"]!!()
    pult["volumeUp"]!!()
    pult["volumeUp"]!!()
    pult["volumeUp"]!!()

    pult["display"]!!()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 2
    // Volume => 5

    pult["volumeDown"]!!()

    pult["display"]!!()
    // Tv => Выкл
    // Mute => Вкл
    // Channel => 2
    // Volume => 4

    pult["mute"]!!()
//    pult["mute"]!!()

    pult["display"]!!()
    // Tv => Выкл
    // Mute => Выкл
    // Channel => 2
    // Volume => 5

    pult["onOff"]!!()
//    pult["onOff"]()

    pult["display"]!!()
    // Tv => Вкл
    // Mute => Выкл
    // Channel => 2
    // Volume => 5
}