package com.corn.cornpos.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
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
public final class DealsDao_Impl implements DealsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Deals> __insertionAdapterOfDeals;

  private final EntityDeletionOrUpdateAdapter<Deals> __deletionAdapterOfDeals;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllDeals;

  public DealsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDeals = new EntityInsertionAdapter<Deals>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Deals` (`CategoryID`,`CategoryName`,`DealID`,`DealItemQuantity`,`DealItems`,`DealName`,`DealPrice`,`intDealID`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Deals value) {
        stmt.bindLong(1, value.getCategoryID());
        if (value.getCategoryName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCategoryName());
        }
        stmt.bindLong(3, value.getDealID());
        stmt.bindLong(4, value.getDealItemQuantity());
        if (value.getDealItems() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDealItems());
        }
        if (value.getDealName() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDealName());
        }
        stmt.bindDouble(7, value.getDealPrice());
        stmt.bindLong(8, value.getIntDealID());
      }
    };
    this.__deletionAdapterOfDeals = new EntityDeletionOrUpdateAdapter<Deals>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Deals` WHERE `intDealID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Deals value) {
        stmt.bindLong(1, value.getIntDealID());
      }
    };
    this.__preparedStmtOfDeleteAllDeals = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Deals";
        return _query;
      }
    };
  }

  @Override
  public Object insertDeals(final Deals deals, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDeals.insert(deals);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteDeals(final Deals deals, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfDeals.handle(deals);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllDeals(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllDeals.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllDeals.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object getDealsBYId(final String id, final Continuation<? super Deals> arg1) {
    final String _sql = "SELECT * FROM DEALS WHERE DealID =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Deals>() {
      @Override
      public Deals call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryID");
          final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryName");
          final int _cursorIndexOfDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "DealID");
          final int _cursorIndexOfDealItemQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "DealItemQuantity");
          final int _cursorIndexOfDealItems = CursorUtil.getColumnIndexOrThrow(_cursor, "DealItems");
          final int _cursorIndexOfDealName = CursorUtil.getColumnIndexOrThrow(_cursor, "DealName");
          final int _cursorIndexOfDealPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "DealPrice");
          final int _cursorIndexOfIntDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "intDealID");
          final Deals _result;
          if(_cursor.moveToFirst()) {
            final int _tmpCategoryID;
            _tmpCategoryID = _cursor.getInt(_cursorIndexOfCategoryID);
            final String _tmpCategoryName;
            if (_cursor.isNull(_cursorIndexOfCategoryName)) {
              _tmpCategoryName = null;
            } else {
              _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
            }
            final int _tmpDealID;
            _tmpDealID = _cursor.getInt(_cursorIndexOfDealID);
            final int _tmpDealItemQuantity;
            _tmpDealItemQuantity = _cursor.getInt(_cursorIndexOfDealItemQuantity);
            final String _tmpDealItems;
            if (_cursor.isNull(_cursorIndexOfDealItems)) {
              _tmpDealItems = null;
            } else {
              _tmpDealItems = _cursor.getString(_cursorIndexOfDealItems);
            }
            final String _tmpDealName;
            if (_cursor.isNull(_cursorIndexOfDealName)) {
              _tmpDealName = null;
            } else {
              _tmpDealName = _cursor.getString(_cursorIndexOfDealName);
            }
            final double _tmpDealPrice;
            _tmpDealPrice = _cursor.getDouble(_cursorIndexOfDealPrice);
            final int _tmpIntDealID;
            _tmpIntDealID = _cursor.getInt(_cursorIndexOfIntDealID);
            _result = new Deals(_tmpCategoryID,_tmpCategoryName,_tmpDealID,_tmpDealItemQuantity,_tmpDealItems,_tmpDealName,_tmpDealPrice,_tmpIntDealID);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<List<Deals>> getAllDeals() {
    final String _sql = "SELECT * FROM Deals";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Deals"}, new Callable<List<Deals>>() {
      @Override
      public List<Deals> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryID");
          final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryName");
          final int _cursorIndexOfDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "DealID");
          final int _cursorIndexOfDealItemQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "DealItemQuantity");
          final int _cursorIndexOfDealItems = CursorUtil.getColumnIndexOrThrow(_cursor, "DealItems");
          final int _cursorIndexOfDealName = CursorUtil.getColumnIndexOrThrow(_cursor, "DealName");
          final int _cursorIndexOfDealPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "DealPrice");
          final int _cursorIndexOfIntDealID = CursorUtil.getColumnIndexOrThrow(_cursor, "intDealID");
          final List<Deals> _result = new ArrayList<Deals>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Deals _item;
            final int _tmpCategoryID;
            _tmpCategoryID = _cursor.getInt(_cursorIndexOfCategoryID);
            final String _tmpCategoryName;
            if (_cursor.isNull(_cursorIndexOfCategoryName)) {
              _tmpCategoryName = null;
            } else {
              _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
            }
            final int _tmpDealID;
            _tmpDealID = _cursor.getInt(_cursorIndexOfDealID);
            final int _tmpDealItemQuantity;
            _tmpDealItemQuantity = _cursor.getInt(_cursorIndexOfDealItemQuantity);
            final String _tmpDealItems;
            if (_cursor.isNull(_cursorIndexOfDealItems)) {
              _tmpDealItems = null;
            } else {
              _tmpDealItems = _cursor.getString(_cursorIndexOfDealItems);
            }
            final String _tmpDealName;
            if (_cursor.isNull(_cursorIndexOfDealName)) {
              _tmpDealName = null;
            } else {
              _tmpDealName = _cursor.getString(_cursorIndexOfDealName);
            }
            final double _tmpDealPrice;
            _tmpDealPrice = _cursor.getDouble(_cursorIndexOfDealPrice);
            final int _tmpIntDealID;
            _tmpIntDealID = _cursor.getInt(_cursorIndexOfIntDealID);
            _item = new Deals(_tmpCategoryID,_tmpCategoryName,_tmpDealID,_tmpDealItemQuantity,_tmpDealItems,_tmpDealName,_tmpDealPrice,_tmpIntDealID);
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
