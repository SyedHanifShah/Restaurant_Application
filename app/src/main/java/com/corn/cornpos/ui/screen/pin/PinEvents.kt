package com.corn.cornpos.ui.screen.pin

sealed class PinEvents{
    data class OnPinChange(val pin:String):PinEvents()
    object OnNextClick: PinEvents()
}
