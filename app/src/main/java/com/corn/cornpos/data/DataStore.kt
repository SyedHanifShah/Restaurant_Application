package com.corn.cornpos.data


import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CornPosDataStore(private val context: Context) {

    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("CornPosDataStore")

        val CLIENT_CONN_STRING = stringPreferencesKey("ClientConnString")
        val SELECTED_TABLE = intPreferencesKey("selected_table")
        val SELECTED_TABLE_NAME = stringPreferencesKey("selected_table_name")
        val COVEER_TABLE = intPreferencesKey("cover_table")
        val COVER_TABLE_FLOOR = stringPreferencesKey("cover_table_floor")
        val ORDER_DATE = stringPreferencesKey("order_date")
        val CUSTOMER_NAME = stringPreferencesKey("customer_name")
        val TAKE_AWAY = stringPreferencesKey("take_away_title")
        val CUSTOMER_ID = intPreferencesKey("customer_id")
        val ParentRowId = intPreferencesKey("parent_row_id")
        val SERVICE_TYPE_ID = intPreferencesKey("service_type_id")
        val PASSWORD = stringPreferencesKey("password")
        val ORDER_NUMBER = intPreferencesKey("order_number")
        val PIN = stringPreferencesKey("pin")
        val USERNAME = stringPreferencesKey("user_name")
        val IS_FIRST_LOGIN = booleanPreferencesKey("first_login")
        val IS_EDIT_MODE = booleanPreferencesKey("edit_mode")
        val IS_TABLE_SCREEN = booleanPreferencesKey("is_table_screen_key")
        val IS_TABLE_ALREADY_SELECTED = booleanPreferencesKey("first_login")
        val CAN_DELIVERY = booleanPreferencesKey("Can_Delivery")
        val CAN_DINE_IN = booleanPreferencesKey("Can_DineIn")
        val CAN_TAKEAWAY = booleanPreferencesKey("Can_TakeAway")
        val LIST_KEY = stringPreferencesKey("list_key")

    }

    val getClientConnString: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[CLIENT_CONN_STRING] ?: ""
        }


    suspend fun savedClientConnString(selected_table: String) {
        context.dataStore.edit { preferences ->
            preferences[CLIENT_CONN_STRING] = selected_table
        }
    }


    val getSelectedTable: Flow<Int?> = context.dataStore.data
        .map{ preferences ->
            preferences[SELECTED_TABLE] ?: 0
        }


    suspend fun savedSelectedTable(selected_table: Int) {
        context.dataStore.edit { preferences ->
            preferences[SELECTED_TABLE] = selected_table
        }
    }

    val getSelectedTableName: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[SELECTED_TABLE_NAME] ?: ""
        }


    suspend fun savedSelectedTableName(selected_table: String) {
        context.dataStore.edit { preferences ->
            preferences[SELECTED_TABLE_NAME] = selected_table
        }
    }

    val getCoverTable: Flow<Int?> = context.dataStore.data
        .map{ preferences ->
            preferences[COVEER_TABLE] ?: 0
        }


    suspend fun savedCoverTable(floor: Int) {
        context.dataStore.edit { preferences ->
            preferences[COVEER_TABLE] = floor
        }
    }

    val getCoverTableFloor: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[COVER_TABLE_FLOOR] ?: ""
        }


    suspend fun savedCoverTableFloor(floor: String) {
        context.dataStore.edit { preferences ->
            preferences[COVER_TABLE_FLOOR] = floor
        }
    }

 val getOrderDate: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[ORDER_DATE] ?: ""
        }


    suspend fun savedOrderDate(floor: String) {
        context.dataStore.edit { preferences ->
            preferences[ORDER_DATE] = floor
        }
    }


    val getCustomerName: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[CUSTOMER_NAME] ?: "Walking Customer"
        }


    suspend fun savedCustomerName(name: String) {
        context.dataStore.edit { preferences ->
            preferences[CUSTOMER_NAME] = name
        }
    }
  val getTakeAwayTittle: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[TAKE_AWAY] ?: ""
        }


    suspend fun savedTakeAwayTitle(name: String) {
        context.dataStore.edit { preferences ->
            preferences[TAKE_AWAY] = name
        }
    }

    val getCustomerID: Flow<Int?> = context.dataStore.data
        .map{ preferences ->
            preferences[CUSTOMER_ID] ?: 0
        }


    suspend fun savedCustomerID(ID: Int) {
        context.dataStore.edit { preferences ->
            preferences[CUSTOMER_ID] = ID
        }
    }

    val getItemParentRowID: Flow<Int?> = context.dataStore.data
        .map{ preferences ->
            preferences[ParentRowId] ?: 0
        }


    suspend fun savedParentRowID(ID: Int) {
        context.dataStore.edit { preferences ->
            preferences[ParentRowId] = ID
        }
    }

   val getServiceTypeID: Flow<Int?> = context.dataStore.data
        .map{ preferences ->
            preferences[SERVICE_TYPE_ID] ?: 0
        }


    suspend fun saveServiceTypeID(ID: Int) {
        context.dataStore.edit { preferences ->
            preferences[SERVICE_TYPE_ID] = ID
        }
    }



    val getPassword: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[PASSWORD] ?: ""
        }


    suspend fun savedPassword(password: String) {
        context.dataStore.edit { preferences ->
            preferences[PASSWORD] = password
        }
    }


    val getUserName: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[USERNAME] ?: ""
        }


    suspend fun savedUserName(name: String) {
        context.dataStore.edit { preferences ->
            preferences[USERNAME] = name
        }
    }

    val isFirstLogin: Flow<Boolean?> = context.dataStore.data
        .map{ preferences ->
            preferences[IS_FIRST_LOGIN] ?: false
        }


    suspend fun saveIsFirstLogin(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_FIRST_LOGIN] = value
        }
    }

    val isEditMode: Flow<Boolean?> = context.dataStore.data
        .map{ preferences ->
            preferences[IS_EDIT_MODE] ?: false
        }


    suspend fun saveEditMode(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_EDIT_MODE] = value
        }
    }

    val getIsTableAlreadySelected: Flow<Boolean?> = context.dataStore.data
        .map{ preferences ->
            preferences[IS_TABLE_ALREADY_SELECTED] ?: false
        }


    suspend fun savesTableAlreadySelected(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_TABLE_ALREADY_SELECTED] = value
        }
    }



    val getOrderNumber: Flow<Int?> = context.dataStore.data
        .map{ preferences ->
            preferences[ORDER_NUMBER] ?: 101
        }


    suspend fun savedOrderNumber(number: Int) {
        context.dataStore.edit { preferences ->
            preferences[ORDER_NUMBER] = number
        }
    }




    val isTableScreen: Flow<Boolean?> = context.dataStore.data
        .map{ preferences ->
            preferences[IS_TABLE_SCREEN] ?: false
        }


    suspend fun saveIsTableScreen(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[IS_TABLE_SCREEN] = value
        }
    }





    val getPIN: Flow<String?> = context.dataStore.data
        .map{ preferences ->
            preferences[PIN] ?: ""
        }


    suspend fun savePIN(pin: String) {
        context.dataStore.edit { preferences ->
            preferences[PIN] = pin
        }
    }


    val getCanTakeAway: Flow<Boolean?> = context.dataStore.data
        .map{ preferences ->
            preferences[CAN_TAKEAWAY] ?: false
        }


    suspend fun saveCanTakeAway(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[CAN_TAKEAWAY] = value
        }
    }

    val getCanDineIn: Flow<Boolean?> = context.dataStore.data
        .map{ preferences ->
            preferences[CAN_DINE_IN] ?: false
        }


    suspend fun saveCanDineIn(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[CAN_DINE_IN] = value
        }
    }


    val getCanDelivery : Flow<Boolean?> = context.dataStore.data
        .map{ preferences ->
            preferences[CAN_DELIVERY] ?: false
        }


    suspend fun saveCanDelivery(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[CAN_DELIVERY] = value
        }
    }

    suspend fun saveList( list: List<String>) {
        val listString = list.joinToString(separator = ",")
        context.dataStore.edit { preferences ->
            preferences[LIST_KEY] = listString
        }
    }


    fun readList(): Flow<List<String>> {
        return context.dataStore.data
            .map { preferences ->
                preferences[LIST_KEY]?.split(",") ?: listOf()
            }
    }



}

