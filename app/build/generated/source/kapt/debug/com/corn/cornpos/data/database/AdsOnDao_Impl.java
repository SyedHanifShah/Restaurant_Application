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
public final class AdsOnDao_Impl implements AdsOnDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AdsOn> __insertionAdapterOfAdsOn;

  private final EntityDeletionOrUpdateAdapter<AdsOn> __deletionAdapterOfAdsOn;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllAdsOnData;

  public AdsOnDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAdsOn = new EntityInsertionAdapter<AdsOn>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AdsOn` (`id`,`AdsOnCategoryID`,`AdsOnCategoryName`,`AdsOnID`,`AdsOnName`,`ItemID`,`ItemName`,`IsMultiSelectModifier`,`Price`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AdsOn value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        stmt.bindLong(2, value.getAdsOnCategoryID());
        if (value.getAdsOnCategoryName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAdsOnCategoryName());
        }
        stmt.bindLong(4, value.getAdsOnID());
        if (value.getAdsOnName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAdsOnName());
        }
        stmt.bindLong(6, value.getItemID());
        if (value.getItemName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getItemName());
        }
        final int _tmp = value.getIsMultiSelectModifier() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        stmt.bindDouble(9, value.getPrice());
      }
    };
    this.__deletionAdapterOfAdsOn = new EntityDeletionOrUpdateAdapter<AdsOn>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `AdsOn` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AdsOn value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllAdsOnData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM AdsOn";
        return _query;
      }
    };
  }

  @Override
  public Object insertAdsOn(final AdsOn adsOn, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAdsOn.insert(adsOn);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAdsOn(final AdsOn adsOn, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfAdsOn.handle(adsOn);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllAdsOnData(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllAdsOnData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllAdsOnData.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Flow<List<AdsOn>> getAdsOnByItemId(final String id) {
    final String _sql = "SELECT * FROM AdsOn WHERE ItemID =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"AdsOn"}, new Callable<List<AdsOn>>() {
      @Override
      public List<AdsOn> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAdsOnCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnCategoryID");
          final int _cursorIndexOfAdsOnCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnCategoryName");
          final int _cursorIndexOfAdsOnID = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnID");
          final int _cursorIndexOfAdsOnName = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnName");
          final int _cursorIndexOfItemID = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemID");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemName");
          final int _cursorIndexOfIsMultiSelectModifier = CursorUtil.getColumnIndexOrThrow(_cursor, "IsMultiSelectModifier");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "Price");
          final List<AdsOn> _result = new ArrayList<AdsOn>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AdsOn _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final int _tmpAdsOnCategoryID;
            _tmpAdsOnCategoryID = _cursor.getInt(_cursorIndexOfAdsOnCategoryID);
            final String _tmpAdsOnCategoryName;
            if (_cursor.isNull(_cursorIndexOfAdsOnCategoryName)) {
              _tmpAdsOnCategoryName = null;
            } else {
              _tmpAdsOnCategoryName = _cursor.getString(_cursorIndexOfAdsOnCategoryName);
            }
            final int _tmpAdsOnID;
            _tmpAdsOnID = _cursor.getInt(_cursorIndexOfAdsOnID);
            final String _tmpAdsOnName;
            if (_cursor.isNull(_cursorIndexOfAdsOnName)) {
              _tmpAdsOnName = null;
            } else {
              _tmpAdsOnName = _cursor.getString(_cursorIndexOfAdsOnName);
            }
            final int _tmpItemID;
            _tmpItemID = _cursor.getInt(_cursorIndexOfItemID);
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final boolean _tmpIsMultiSelectModifier;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsMultiSelectModifier);
            _tmpIsMultiSelectModifier = _tmp != 0;
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            _item = new AdsOn(_tmpId,_tmpAdsOnCategoryID,_tmpAdsOnCategoryName,_tmpAdsOnID,_tmpAdsOnName,_tmpItemID,_tmpItemName,_tmpIsMultiSelectModifier,_tmpPrice);
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
  public Flow<List<AdsOn>> getAllAdsOnData() {
    final String _sql = "SELECT * FROM AdsOn";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"AdsOn"}, new Callable<List<AdsOn>>() {
      @Override
      public List<AdsOn> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAdsOnCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnCategoryID");
          final int _cursorIndexOfAdsOnCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnCategoryName");
          final int _cursorIndexOfAdsOnID = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnID");
          final int _cursorIndexOfAdsOnName = CursorUtil.getColumnIndexOrThrow(_cursor, "AdsOnName");
          final int _cursorIndexOfItemID = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemID");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemName");
          final int _cursorIndexOfIsMultiSelectModifier = CursorUtil.getColumnIndexOrThrow(_cursor, "IsMultiSelectModifier");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "Price");
          final List<AdsOn> _result = new ArrayList<AdsOn>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AdsOn _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final int _tmpAdsOnCategoryID;
            _tmpAdsOnCategoryID = _cursor.getInt(_cursorIndexOfAdsOnCategoryID);
            final String _tmpAdsOnCategoryName;
            if (_cursor.isNull(_cursorIndexOfAdsOnCategoryName)) {
              _tmpAdsOnCategoryName = null;
            } else {
              _tmpAdsOnCategoryName = _cursor.getString(_cursorIndexOfAdsOnCategoryName);
            }
            final int _tmpAdsOnID;
            _tmpAdsOnID = _cursor.getInt(_cursorIndexOfAdsOnID);
            final String _tmpAdsOnName;
            if (_cursor.isNull(_cursorIndexOfAdsOnName)) {
              _tmpAdsOnName = null;
            } else {
              _tmpAdsOnName = _cursor.getString(_cursorIndexOfAdsOnName);
            }
            final int _tmpItemID;
            _tmpItemID = _cursor.getInt(_cursorIndexOfItemID);
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final boolean _tmpIsMultiSelectModifier;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsMultiSelectModifier);
            _tmpIsMultiSelectModifier = _tmp != 0;
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            _item = new AdsOn(_tmpId,_tmpAdsOnCategoryID,_tmpAdsOnCategoryName,_tmpAdsOnID,_tmpAdsOnName,_tmpItemID,_tmpItemName,_tmpIsMultiSelectModifier,_tmpPrice);
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
