package com.corn.cornpos.util

sealed class UiEvent{
    object PopBackStack:UiEvent()
    data class ShowSnackBar(val message:String,  val action: String? = null):UiEvent()
    data class Navigate(val route:String):UiEvent()

}
