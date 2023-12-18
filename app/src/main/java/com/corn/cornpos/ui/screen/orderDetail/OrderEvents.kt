package com.corn.cornpos.ui.screen.orderDetail

import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.ui.screen.menu.MenuEvents

sealed  class OrderEvents{

    data class OnIncreaseItem(val item: OrderDetails):OrderEvents()
    data class OnDecreaseItem(val item: OrderDetails):OrderEvents()
    data class OnDelete(val item: OrderDetails):OrderEvents()
    object OnCancelOrderClick:OrderEvents()
   data class OnPLaceOrder(val grossAmount:Int, val GSTAmount:Int) :OrderEvents()
    data class OnUpdateOrder(val grossAmount:Int, val GSTAmount:Int ): OrderEvents()


}
