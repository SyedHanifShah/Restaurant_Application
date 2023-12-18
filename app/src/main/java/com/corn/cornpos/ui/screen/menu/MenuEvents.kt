package com.corn.cornpos.ui.screen.menu


sealed class MenuEvents{
    data class OnItemClick(val ItemId:Int, val name:String, val quantity:Int, val price:Double, val sectionName:String,val parentRowId:Int , val adsOnCategory:String?,val isDeal: Int, val parentDeal:String?, val intDealId:Int?= null):MenuEvents()

}

