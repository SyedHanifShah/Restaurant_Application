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
public final class TableDeo_Impl implements TableDeo {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Table> __insertionAdapterOfTable;

  private final EntityDeletionOrUpdateAdapter<Table> __deletionAdapterOfTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTableData;

  public TableDeo_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTable = new EntityInsertionAdapter<Table>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Table` (`BookingFrom`,`BookingTo`,`CustomerID`,`FloorID`,`FloorName`,`TableID`,`TableNo`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Table value) {
        if (value.getBookingFrom() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getBookingFrom());
        }
        if (value.getBookingTo() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBookingTo());
        }
        stmt.bindLong(3, value.getCustomerID());
        stmt.bindLong(4, value.getFloorID());
        if (value.getFloorName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFloorName());
        }
        stmt.bindLong(6, value.getTableID());
        if (value.getTableNo() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTableNo());
        }
      }
    };
    this.__deletionAdapterOfTable = new EntityDeletionOrUpdateAdapter<Table>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Table` WHERE `TableID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Table value) {
        stmt.bindLong(1, value.getTableID());
      }
    };
    this.__preparedStmtOfDeleteAllTableData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM `Table`";
        return _query;
      }
    };
  }

  @Override
  public Object insertTable(final Table table, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTable.insert(table);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteTable(final Table table, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTable.handle(table);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllTableData(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTableData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllTableData.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Flow<List<Table>> getTableId(final String id) {
    final String _sql = "SELECT * FROM `Table` WHERE TableID =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Table"}, new Callable<List<Table>>() {
      @Override
      public List<Table> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBookingFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "BookingFrom");
          final int _cursorIndexOfBookingTo = CursorUtil.getColumnIndexOrThrow(_cursor, "BookingTo");
          final int _cursorIndexOfCustomerID = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerID");
          final int _cursorIndexOfFloorID = CursorUtil.getColumnIndexOrThrow(_cursor, "FloorID");
          final int _cursorIndexOfFloorName = CursorUtil.getColumnIndexOrThrow(_cursor, "FloorName");
          final int _cursorIndexOfTableID = CursorUtil.getColumnIndexOrThrow(_cursor, "TableID");
          final int _cursorIndexOfTableNo = CursorUtil.getColumnIndexOrThrow(_cursor, "TableNo");
          final List<Table> _result = new ArrayList<Table>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Table _item;
            final String _tmpBookingFrom;
            if (_cursor.isNull(_cursorIndexOfBookingFrom)) {
              _tmpBookingFrom = null;
            } else {
              _tmpBookingFrom = _cursor.getString(_cursorIndexOfBookingFrom);
            }
            final String _tmpBookingTo;
            if (_cursor.isNull(_cursorIndexOfBookingTo)) {
              _tmpBookingTo = null;
            } else {
              _tmpBookingTo = _cursor.getString(_cursorIndexOfBookingTo);
            }
            final int _tmpCustomerID;
            _tmpCustomerID = _cursor.getInt(_cursorIndexOfCustomerID);
            final int _tmpFloorID;
            _tmpFloorID = _cursor.getInt(_cursorIndexOfFloorID);
            final String _tmpFloorName;
            if (_cursor.isNull(_cursorIndexOfFloorName)) {
              _tmpFloorName = null;
            } else {
              _tmpFloorName = _cursor.getString(_cursorIndexOfFloorName);
            }
            final int _tmpTableID;
            _tmpTableID = _cursor.getInt(_cursorIndexOfTableID);
            final String _tmpTableNo;
            if (_cursor.isNull(_cursorIndexOfTableNo)) {
              _tmpTableNo = null;
            } else {
              _tmpTableNo = _cursor.getString(_cursorIndexOfTableNo);
            }
            _item = new Table(_tmpBookingFrom,_tmpBookingTo,_tmpCustomerID,_tmpFloorID,_tmpFloorName,_tmpTableID,_tmpTableNo);
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
  public Flow<List<Table>> getAllTableData() {
    final String _sql = "SELECT * FROM `Table`";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Table"}, new Callable<List<Table>>() {
      @Override
      public List<Table> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfBookingFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "BookingFrom");
          final int _cursorIndexOfBookingTo = CursorUtil.getColumnIndexOrThrow(_cursor, "BookingTo");
          final int _cursorIndexOfCustomerID = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerID");
          final int _cursorIndexOfFloorID = CursorUtil.getColumnIndexOrThrow(_cursor, "FloorID");
          final int _cursorIndexOfFloorName = CursorUtil.getColumnIndexOrThrow(_cursor, "FloorName");
          final int _cursorIndexOfTableID = CursorUtil.getColumnIndexOrThrow(_cursor, "TableID");
          final int _cursorIndexOfTableNo = CursorUtil.getColumnIndexOrThrow(_cursor, "TableNo");
          final List<Table> _result = new ArrayList<Table>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Table _item;
            final String _tmpBookingFrom;
            if (_cursor.isNull(_cursorIndexOfBookingFrom)) {
              _tmpBookingFrom = null;
            } else {
              _tmpBookingFrom = _cursor.getString(_cursorIndexOfBookingFrom);
            }
            final String _tmpBookingTo;
            if (_cursor.isNull(_cursorIndexOfBookingTo)) {
              _tmpBookingTo = null;
            } else {
              _tmpBookingTo = _cursor.getString(_cursorIndexOfBookingTo);
            }
            final int _tmpCustomerID;
            _tmpCustomerID = _cursor.getInt(_cursorIndexOfCustomerID);
            final int _tmpFloorID;
            _tmpFloorID = _cursor.getInt(_cursorIndexOfFloorID);
            final String _tmpFloorName;
            if (_cursor.isNull(_cursorIndexOfFloorName)) {
              _tmpFloorName = null;
            } else {
              _tmpFloorName = _cursor.getString(_cursorIndexOfFloorName);
            }
            final int _tmpTableID;
            _tmpTableID = _cursor.getInt(_cursorIndexOfTableID);
            final String _tmpTableNo;
            if (_cursor.isNull(_cursorIndexOfTableNo)) {
              _tmpTableNo = null;
            } else {
              _tmpTableNo = _cursor.getString(_cursorIndexOfTableNo);
            }
            _item = new Table(_tmpBookingFrom,_tmpBookingTo,_tmpCustomerID,_tmpFloorID,_tmpFloorName,_tmpTableID,_tmpTableNo);
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
