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
public final class CategoryDao_Impl implements CategoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Category> __insertionAdapterOfCategory;

  private final EntityDeletionOrUpdateAdapter<Category> __deletionAdapterOfCategory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCategoryData;

  public CategoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCategory = new EntityInsertionAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Category` (`CategoryID`,`Category`,`ImagePath`,`ParentCategoryID`,`ProductCount`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        stmt.bindLong(1, value.getCategoryID());
        if (value.getCategory() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCategory());
        }
        if (value.getImagePath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImagePath());
        }
        stmt.bindLong(4, value.getParentCategoryID());
        stmt.bindLong(5, value.getProductCount());
      }
    };
    this.__deletionAdapterOfCategory = new EntityDeletionOrUpdateAdapter<Category>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Category` WHERE `CategoryID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Category value) {
        stmt.bindLong(1, value.getCategoryID());
      }
    };
    this.__preparedStmtOfDeleteAllCategoryData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Category";
        return _query;
      }
    };
  }

  @Override
  public Object insertCategory(final Category category, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCategory.insert(category);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteCategory(final Category category, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCategory.handle(category);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllCategoryData(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCategoryData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllCategoryData.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object getCategoryId(final String id, final Continuation<? super Category> arg1) {
    final String _sql = "SELECT * FROM Category WHERE CategoryID =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Category>() {
      @Override
      public Category call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryID");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "Category");
          final int _cursorIndexOfImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "ImagePath");
          final int _cursorIndexOfParentCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "ParentCategoryID");
          final int _cursorIndexOfProductCount = CursorUtil.getColumnIndexOrThrow(_cursor, "ProductCount");
          final Category _result;
          if(_cursor.moveToFirst()) {
            final int _tmpCategoryID;
            _tmpCategoryID = _cursor.getInt(_cursorIndexOfCategoryID);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpImagePath;
            if (_cursor.isNull(_cursorIndexOfImagePath)) {
              _tmpImagePath = null;
            } else {
              _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
            }
            final int _tmpParentCategoryID;
            _tmpParentCategoryID = _cursor.getInt(_cursorIndexOfParentCategoryID);
            final int _tmpProductCount;
            _tmpProductCount = _cursor.getInt(_cursorIndexOfProductCount);
            _result = new Category(_tmpCategoryID,_tmpCategory,_tmpImagePath,_tmpParentCategoryID,_tmpProductCount);
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
  public Flow<List<Category>> getAllCategoryData() {
    final String _sql = "SELECT * FROM Category";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Category"}, new Callable<List<Category>>() {
      @Override
      public List<Category> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryID");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "Category");
          final int _cursorIndexOfImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "ImagePath");
          final int _cursorIndexOfParentCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "ParentCategoryID");
          final int _cursorIndexOfProductCount = CursorUtil.getColumnIndexOrThrow(_cursor, "ProductCount");
          final List<Category> _result = new ArrayList<Category>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Category _item;
            final int _tmpCategoryID;
            _tmpCategoryID = _cursor.getInt(_cursorIndexOfCategoryID);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpImagePath;
            if (_cursor.isNull(_cursorIndexOfImagePath)) {
              _tmpImagePath = null;
            } else {
              _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
            }
            final int _tmpParentCategoryID;
            _tmpParentCategoryID = _cursor.getInt(_cursorIndexOfParentCategoryID);
            final int _tmpProductCount;
            _tmpProductCount = _cursor.getInt(_cursorIndexOfProductCount);
            _item = new Category(_tmpCategoryID,_tmpCategory,_tmpImagePath,_tmpParentCategoryID,_tmpProductCount);
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
