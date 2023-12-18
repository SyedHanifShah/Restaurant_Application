package com.corn.cornpos.data.database

import com.corn.cornpos.data.remote.dto.MYOrder
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import java.lang.reflect.Type

class MYOrderJsonSerializer : JsonSerializer<MYOrder> {
    override fun serialize(src: MYOrder, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        val jsonObject = JsonObject()
        // Add properties to jsonObject in the order you want them to appear
        jsonObject.add("OrderID", context.serialize(src.OrderID))
        jsonObject.add("ID", context.serialize(src.ID))
        jsonObject.add("Name", context.serialize(src.Name))
        jsonObject.add("Price", context.serialize(src.Price))
        jsonObject.add("Amount", context.serialize(src.Amount))
        jsonObject.add("IsVoid", context.serialize(src.IsVoid))
        jsonObject.add("Qty", context.serialize(src.Qty))
        jsonObject.add("Discount", context.serialize(src.Discount))
        jsonObject.add("ItemWiseGST", context.serialize(src.ItemWiseGST))
        jsonObject.add("IsAddsOn", context.serialize(src.IsAddsOn))
        jsonObject.add("IsDeal", context.serialize(src.IsDeal))
        jsonObject.add("DealID", context.serialize(src.DealID))
        jsonObject.add("DealQty", context.serialize(src.DealQty))
        jsonObject.add("IsHasAddsOn", context.serialize(src.IsHasAddsOn))
        jsonObject.add("ModifierParentID", context.serialize(src.ModifierParentID))
        jsonObject.add("ModifierParentRowID", context.serialize(src.ModifierParentRowID))
        jsonObject.add("InvoiceDetailID", context.serialize(src.InvoiceDetailID))
        jsonObject.add("SectionID", context.serialize(src.SectionID))
        jsonObject.add("SectionName", context.serialize(src.SectionName))
        jsonObject.add("IsFree", context.serialize(src.IsFree))
        jsonObject.add("OrderNotes", context.serialize(src.OrderNotes))
        return jsonObject
    }
}

