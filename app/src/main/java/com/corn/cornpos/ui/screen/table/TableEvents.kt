package com.corn.cornpos.ui.screen.table

sealed class TableEvents{
    data class OnTableSelection(val table:Int,val tableName :String, val floorName:String):TableEvents()
    object OnTableUnSelection:TableEvents()
    data class OnCoverTableChange(val cover:Int):TableEvents()
    data class OnNameSearched(val name:String, val id:Int):TableEvents()
}
