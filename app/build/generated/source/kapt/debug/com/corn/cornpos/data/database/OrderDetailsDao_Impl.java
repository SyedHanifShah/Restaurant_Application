package com.corn.cornpos.data.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OrderDetailsDao_Impl implements OrderDetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OrderDetails> __insertionAdapterOfOrderDetails;

  private final EntityDeletionOrUpdateAdapter<OrderDetails> __deletionAdapterOfOrderDetails;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllOrder;

  public OrderDetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderDetails = new EntityInsertionAdapter<OrderDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `OrderDetails` (`orderNumber`,`itemName`,`itemId`,`quantity`,`adsOnCategory`,`price`,`sectionName`,`parentRowId`,`lngDealDetailID`,`intDealID`,`isDeal`,`parentDeal`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderDetails value) {
        if (value.getOrderNumber() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getOrderNumber());
        }
        if (value.getItemName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getItemName());
        }
        stmt.bindLong(3, value.getItemId());
        stmt.bindLong(4, value.getQuantity());
        if (value.getAdsOnCategory() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAdsOnCategory());
        }
        stmt.bindLong(6, value.getPrice());
        if (value.getSectionName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSectionName());
        }
        stmt.bindLong(8, value.getParentRowId());
        if (value.getLngDealDetailID() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getLngDealDetailID());
        }
        if (value.getIntDealID() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getIntDealID());
        }
        stmt.bindLong(11, value.isDeal());
        if (value.getParentDeal() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getParentDeal());
        }
      }
    };
    this.__deletionAdapterOfOrderDetails = new EntityDeletionOrUpdateAdapter<OrderDetails>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `OrderDetails` WHERE `orderNumber` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OrderDetails value) {
        if (value.getOrderNumber() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getOrderNumber());
        }
      }
    };
    this.__preparedStmtOfDeleteAllOrder = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete FROM OrderDetails";
        return _query;
      }
    };
  }

  @Override
  public Object insertOrder(final OrderDetails orderDetails,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOrderDetails.insert(orderDetails);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void insertOrderList(final List<OrderDetails> order) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOrderDetails.insert(order);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object deleteOrder(final OrderDetails orderDetails,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOrderDetails.handle(orderDetails);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAllOrder(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllOrder.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllOrder.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<OrderDetails>> getOrderByItemId(final String id) {
    final String _sql = "SELECT * FROM orderdetails WHERE orderNumber =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"orderdetails"}, new Callable<List<OrderDetails>>() {
      @Override
      public List<OrderDetails> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "orderNumber");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "itemName");
          final int _cursorIndexOfItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "itemId");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfAdsOnCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "adsOnCategory");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfSectionName = CursorUtil.getColumnIndexOrThrow(_cursor, "sectionName");
          final int _cursorIndexOfParentRowId = CursorUtil.getColumnIndexOrThrow(_cursor, "parentRowId");
          final int _cursorIndexOfLngDealDetailID = CursorUtil.getColumnIndexOrThrow(_cursor, "lngDealDetailID");
          final int _cursorIndexOfIntDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "intDealID");
          final int _cursorIndexOfIsDeal = CursorUtil.getColumnIndexOrThrow(_cursor, "isDeal");
          final int _cursorIndexOfParentDeal = CursorUtil.getColumnIndexOrThrow(_cursor, "parentDeal");
          final List<OrderDetails> _result = new ArrayList<OrderDetails>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final OrderDetails _item;
            final Integer _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getInt(_cursorIndexOfOrderNumber);
            }
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final int _tmpItemId;
            _tmpItemId = _cursor.getInt(_cursorIndexOfItemId);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final String _tmpAdsOnCategory;
            if (_cursor.isNull(_cursorIndexOfAdsOnCategory)) {
              _tmpAdsOnCategory = null;
            } else {
              _tmpAdsOnCategory = _cursor.getString(_cursorIndexOfAdsOnCategory);
            }
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final String _tmpSectionName;
            if (_cursor.isNull(_cursorIndexOfSectionName)) {
              _tmpSectionName = null;
            } else {
              _tmpSectionName = _cursor.getString(_cursorIndexOfSectionName);
            }
            final int _tmpParentRowId;
            _tmpParentRowId = _cursor.getInt(_cursorIndexOfParentRowId);
            final Integer _tmpLngDealDetailID;
            if (_cursor.isNull(_cursorIndexOfLngDealDetailID)) {
              _tmpLngDealDetailID = null;
            } else {
              _tmpLngDealDetailID = _cursor.getInt(_cursorIndexOfLngDealDetailID);
            }
            final Integer _tmpIntDealID;
            if (_cursor.isNull(_cursorIndexOfIntDealID)) {
              _tmpIntDealID = null;
            } else {
              _tmpIntDealID = _cursor.getInt(_cursorIndexOfIntDealID);
            }
            final int _tmpIsDeal;
            _tmpIsDeal = _cursor.getInt(_cursorIndexOfIsDeal);
            final String _tmpParentDeal;
            if (_cursor.isNull(_cursorIndexOfParentDeal)) {
              _tmpParentDeal = null;
            } else {
              _tmpParentDeal = _cursor.getString(_cursorIndexOfParentDeal);
            }
            _item = new OrderDetails(_tmpOrderNumber,_tmpItemName,_tmpItemId,_tmpQuantity,_tmpAdsOnCategory,_tmpPrice,_tmpSectionName,_tmpParentRowId,_tmpLngDealDetailID,_tmpIntDealID,_tmpIsDeal,_tmpParentDeal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<OrderDetails>> getAllOrder() {
    final String _sql = "SELECT * FROM OrderDetails";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"OrderDetails"}, new Callable<List<OrderDetails>>() {
      @Override
      public List<OrderDetails> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "orderNumber");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "itemName");
          final int _cursorIndexOfItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "itemId");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfAdsOnCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "adsOnCategory");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfSectionName = CursorUtil.getColumnIndexOrThrow(_cursor, "sectionName");
          final int _cursorIndexOfParentRowId = CursorUtil.getColumnIndexOrThrow(_cursor, "parentRowId");
          final int _cursorIndexOfLngDealDetailID = CursorUtil.getColumnIndexOrThrow(_cursor, "lngDealDetailID");
          final int _cursorIndexOfIntDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "intDealID");
          final int _cursorIndexOfIsDeal = CursorUtil.getColumnIndexOrThrow(_cursor, "isDeal");
          final int _cursorIndexOfParentDeal = CursorUtil.getColumnIndexOrThrow(_cursor, "parentDeal");
          final List<OrderDetails> _result = new ArrayList<OrderDetails>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final OrderDetails _item;
            final Integer _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getInt(_cursorIndexOfOrderNumber);
            }
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final int _tmpItemId;
            _tmpItemId = _cursor.getInt(_cursorIndexOfItemId);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final String _tmpAdsOnCategory;
            if (_cursor.isNull(_cursorIndexOfAdsOnCategory)) {
              _tmpAdsOnCategory = null;
            } else {
              _tmpAdsOnCategory = _cursor.getString(_cursorIndexOfAdsOnCategory);
            }
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final String _tmpSectionName;
            if (_cursor.isNull(_cursorIndexOfSectionName)) {
              _tmpSectionName = null;
            } else {
              _tmpSectionName = _cursor.getString(_cursorIndexOfSectionName);
            }
            final int _tmpParentRowId;
            _tmpParentRowId = _cursor.getInt(_cursorIndexOfParentRowId);
            final Integer _tmpLngDealDetailID;
            if (_cursor.isNull(_cursorIndexOfLngDealDetailID)) {
              _tmpLngDealDetailID = null;
            } else {
              _tmpLngDealDetailID = _cursor.getInt(_cursorIndexOfLngDealDetailID);
            }
            final Integer _tmpIntDealID;
            if (_cursor.isNull(_cursorIndexOfIntDealID)) {
              _tmpIntDealID = null;
            } else {
              _tmpIntDealID = _cursor.getInt(_cursorIndexOfIntDealID);
            }
            final int _tmpIsDeal;
            _tmpIsDeal = _cursor.getInt(_cursorIndexOfIsDeal);
            final String _tmpParentDeal;
            if (_cursor.isNull(_cursorIndexOfParentDeal)) {
              _tmpParentDeal = null;
            } else {
              _tmpParentDeal = _cursor.getString(_cursorIndexOfParentDeal);
            }
            _item = new OrderDetails(_tmpOrderNumber,_tmpItemName,_tmpItemId,_tmpQuantity,_tmpAdsOnCategory,_tmpPrice,_tmpSectionName,_tmpParentRowId,_tmpLngDealDetailID,_tmpIntDealID,_tmpIsDeal,_tmpParentDeal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
