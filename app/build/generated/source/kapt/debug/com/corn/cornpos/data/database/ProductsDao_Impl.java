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
public final class ProductsDao_Impl implements ProductsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Products> __insertionAdapterOfProducts;

  private final EntityDeletionOrUpdateAdapter<Products> __deletionAdapterOfProducts;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllProductData;

  public ProductsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProducts = new EntityInsertionAdapter<Products>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Products` (`ItemID`,`CategoryID`,`DiscountPer`,`DiscountPrice`,`Favourite`,`ImagePath`,`IsAddsOn`,`IsDeal`,`IsHasAddsOn`,`IsUnGroup`,`ItemCode`,`ItemName`,`Price`,`Rating`,`SectionID`,`SectionName`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Products value) {
        stmt.bindLong(1, value.getItemID());
        stmt.bindLong(2, value.getCategoryID());
        stmt.bindLong(3, value.getDiscountPer());
        stmt.bindLong(4, value.getDiscountPrice());
        stmt.bindLong(5, value.getFavourite());
        if (value.getImagePath() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImagePath());
        }
        stmt.bindLong(7, value.getIsAddsOn());
        final int _tmp = value.getIsDeal() ? 1 : 0;
        stmt.bindLong(8, _tmp);
        stmt.bindLong(9, value.getIsHasAddsOn());
        final int _tmp_1 = value.getIsUnGroup() ? 1 : 0;
        stmt.bindLong(10, _tmp_1);
        if (value.getItemCode() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getItemCode());
        }
        if (value.getItemName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getItemName());
        }
        stmt.bindDouble(13, value.getPrice());
        stmt.bindLong(14, value.getRating());
        stmt.bindLong(15, value.getSectionID());
        if (value.getSectionName() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSectionName());
        }
      }
    };
    this.__deletionAdapterOfProducts = new EntityDeletionOrUpdateAdapter<Products>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Products` WHERE `ItemID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Products value) {
        stmt.bindLong(1, value.getItemID());
      }
    };
    this.__preparedStmtOfDeleteAllProductData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Products";
        return _query;
      }
    };
  }

  @Override
  public Object insertProduct(final Products products, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProducts.insert(products);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteProduct(final Products products, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProducts.handle(products);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllProductData(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllProductData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllProductData.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Flow<List<Products>> getProductId(final String id) {
    final String _sql = "SELECT * FROM Products WHERE CategoryID =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Products"}, new Callable<List<Products>>() {
      @Override
      public List<Products> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfItemID = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemID");
          final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryID");
          final int _cursorIndexOfDiscountPer = CursorUtil.getColumnIndexOrThrow(_cursor, "DiscountPer");
          final int _cursorIndexOfDiscountPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "DiscountPrice");
          final int _cursorIndexOfFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "Favourite");
          final int _cursorIndexOfImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "ImagePath");
          final int _cursorIndexOfIsAddsOn = CursorUtil.getColumnIndexOrThrow(_cursor, "IsAddsOn");
          final int _cursorIndexOfIsDeal = CursorUtil.getColumnIndexOrThrow(_cursor, "IsDeal");
          final int _cursorIndexOfIsHasAddsOn = CursorUtil.getColumnIndexOrThrow(_cursor, "IsHasAddsOn");
          final int _cursorIndexOfIsUnGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "IsUnGroup");
          final int _cursorIndexOfItemCode = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemCode");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemName");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "Price");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "Rating");
          final int _cursorIndexOfSectionID = CursorUtil.getColumnIndexOrThrow(_cursor, "SectionID");
          final int _cursorIndexOfSectionName = CursorUtil.getColumnIndexOrThrow(_cursor, "SectionName");
          final List<Products> _result = new ArrayList<Products>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Products _item;
            final int _tmpItemID;
            _tmpItemID = _cursor.getInt(_cursorIndexOfItemID);
            final int _tmpCategoryID;
            _tmpCategoryID = _cursor.getInt(_cursorIndexOfCategoryID);
            final int _tmpDiscountPer;
            _tmpDiscountPer = _cursor.getInt(_cursorIndexOfDiscountPer);
            final int _tmpDiscountPrice;
            _tmpDiscountPrice = _cursor.getInt(_cursorIndexOfDiscountPrice);
            final int _tmpFavourite;
            _tmpFavourite = _cursor.getInt(_cursorIndexOfFavourite);
            final String _tmpImagePath;
            if (_cursor.isNull(_cursorIndexOfImagePath)) {
              _tmpImagePath = null;
            } else {
              _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
            }
            final int _tmpIsAddsOn;
            _tmpIsAddsOn = _cursor.getInt(_cursorIndexOfIsAddsOn);
            final boolean _tmpIsDeal;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDeal);
            _tmpIsDeal = _tmp != 0;
            final int _tmpIsHasAddsOn;
            _tmpIsHasAddsOn = _cursor.getInt(_cursorIndexOfIsHasAddsOn);
            final boolean _tmpIsUnGroup;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsUnGroup);
            _tmpIsUnGroup = _tmp_1 != 0;
            final String _tmpItemCode;
            if (_cursor.isNull(_cursorIndexOfItemCode)) {
              _tmpItemCode = null;
            } else {
              _tmpItemCode = _cursor.getString(_cursorIndexOfItemCode);
            }
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            final int _tmpSectionID;
            _tmpSectionID = _cursor.getInt(_cursorIndexOfSectionID);
            final String _tmpSectionName;
            if (_cursor.isNull(_cursorIndexOfSectionName)) {
              _tmpSectionName = null;
            } else {
              _tmpSectionName = _cursor.getString(_cursorIndexOfSectionName);
            }
            _item = new Products(_tmpItemID,_tmpCategoryID,_tmpDiscountPer,_tmpDiscountPrice,_tmpFavourite,_tmpImagePath,_tmpIsAddsOn,_tmpIsDeal,_tmpIsHasAddsOn,_tmpIsUnGroup,_tmpItemCode,_tmpItemName,_tmpPrice,_tmpRating,_tmpSectionID,_tmpSectionName);
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
  public Flow<List<Products>> getAllProductData() {
    final String _sql = "SELECT * FROM Products";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Products"}, new Callable<List<Products>>() {
      @Override
      public List<Products> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfItemID = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemID");
          final int _cursorIndexOfCategoryID = CursorUtil.getColumnIndexOrThrow(_cursor, "CategoryID");
          final int _cursorIndexOfDiscountPer = CursorUtil.getColumnIndexOrThrow(_cursor, "DiscountPer");
          final int _cursorIndexOfDiscountPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "DiscountPrice");
          final int _cursorIndexOfFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "Favourite");
          final int _cursorIndexOfImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "ImagePath");
          final int _cursorIndexOfIsAddsOn = CursorUtil.getColumnIndexOrThrow(_cursor, "IsAddsOn");
          final int _cursorIndexOfIsDeal = CursorUtil.getColumnIndexOrThrow(_cursor, "IsDeal");
          final int _cursorIndexOfIsHasAddsOn = CursorUtil.getColumnIndexOrThrow(_cursor, "IsHasAddsOn");
          final int _cursorIndexOfIsUnGroup = CursorUtil.getColumnIndexOrThrow(_cursor, "IsUnGroup");
          final int _cursorIndexOfItemCode = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemCode");
          final int _cursorIndexOfItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "ItemName");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "Price");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "Rating");
          final int _cursorIndexOfSectionID = CursorUtil.getColumnIndexOrThrow(_cursor, "SectionID");
          final int _cursorIndexOfSectionName = CursorUtil.getColumnIndexOrThrow(_cursor, "SectionName");
          final List<Products> _result = new ArrayList<Products>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Products _item;
            final int _tmpItemID;
            _tmpItemID = _cursor.getInt(_cursorIndexOfItemID);
            final int _tmpCategoryID;
            _tmpCategoryID = _cursor.getInt(_cursorIndexOfCategoryID);
            final int _tmpDiscountPer;
            _tmpDiscountPer = _cursor.getInt(_cursorIndexOfDiscountPer);
            final int _tmpDiscountPrice;
            _tmpDiscountPrice = _cursor.getInt(_cursorIndexOfDiscountPrice);
            final int _tmpFavourite;
            _tmpFavourite = _cursor.getInt(_cursorIndexOfFavourite);
            final String _tmpImagePath;
            if (_cursor.isNull(_cursorIndexOfImagePath)) {
              _tmpImagePath = null;
            } else {
              _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
            }
            final int _tmpIsAddsOn;
            _tmpIsAddsOn = _cursor.getInt(_cursorIndexOfIsAddsOn);
            final boolean _tmpIsDeal;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDeal);
            _tmpIsDeal = _tmp != 0;
            final int _tmpIsHasAddsOn;
            _tmpIsHasAddsOn = _cursor.getInt(_cursorIndexOfIsHasAddsOn);
            final boolean _tmpIsUnGroup;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsUnGroup);
            _tmpIsUnGroup = _tmp_1 != 0;
            final String _tmpItemCode;
            if (_cursor.isNull(_cursorIndexOfItemCode)) {
              _tmpItemCode = null;
            } else {
              _tmpItemCode = _cursor.getString(_cursorIndexOfItemCode);
            }
            final String _tmpItemName;
            if (_cursor.isNull(_cursorIndexOfItemName)) {
              _tmpItemName = null;
            } else {
              _tmpItemName = _cursor.getString(_cursorIndexOfItemName);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final int _tmpRating;
            _tmpRating = _cursor.getInt(_cursorIndexOfRating);
            final int _tmpSectionID;
            _tmpSectionID = _cursor.getInt(_cursorIndexOfSectionID);
            final String _tmpSectionName;
            if (_cursor.isNull(_cursorIndexOfSectionName)) {
              _tmpSectionName = null;
            } else {
              _tmpSectionName = _cursor.getString(_cursorIndexOfSectionName);
            }
            _item = new Products(_tmpItemID,_tmpCategoryID,_tmpDiscountPer,_tmpDiscountPrice,_tmpFavourite,_tmpImagePath,_tmpIsAddsOn,_tmpIsDeal,_tmpIsHasAddsOn,_tmpIsUnGroup,_tmpItemCode,_tmpItemName,_tmpPrice,_tmpRating,_tmpSectionID,_tmpSectionName);
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
