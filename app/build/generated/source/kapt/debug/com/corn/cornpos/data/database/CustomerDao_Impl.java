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
public final class CustomerDao_Impl implements CustomerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Customer> __insertionAdapterOfCustomer;

  private final EntityDeletionOrUpdateAdapter<Customer> __deletionAdapterOfCustomer;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllCustomer;

  public CustomerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCustomer = new EntityInsertionAdapter<Customer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Customer` (`Address`,`CNIC`,`CardID`,`CustomerCode`,`CustomerID`,`CustomerImage`,`CustomerName`,`DistributorID`,`EmailAddress`,`Gender`,`Nature`,`OtherContactNo`,`Points`,`PrimaryContact`,`ProfessionID`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Customer value) {
        if (value.getAddress() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAddress());
        }
        if (value.getCNIC() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCNIC());
        }
        if (value.getCardID() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCardID());
        }
        if (value.getCustomerCode() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCustomerCode());
        }
        stmt.bindLong(5, value.getCustomerID());
        if (value.getCustomerImage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCustomerImage());
        }
        if (value.getCustomerName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCustomerName());
        }
        stmt.bindLong(8, value.getDistributorID());
        if (value.getEmailAddress() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getEmailAddress());
        }
        if (value.getGender() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getGender());
        }
        if (value.getNature() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getNature());
        }
        if (value.getOtherContactNo() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getOtherContactNo());
        }
        stmt.bindDouble(13, value.getPoints());
        if (value.getPrimaryContact() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getPrimaryContact());
        }
        stmt.bindLong(15, value.getProfessionID());
      }
    };
    this.__deletionAdapterOfCustomer = new EntityDeletionOrUpdateAdapter<Customer>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Customer` WHERE `CustomerID` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Customer value) {
        stmt.bindLong(1, value.getCustomerID());
      }
    };
    this.__preparedStmtOfDeleteAllCustomer = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "Delete FROM Customer";
        return _query;
      }
    };
  }

  @Override
  public Object insertCustomer(final Customer customer, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCustomer.insert(customer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteCustomer(final Customer customer, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCustomer.handle(customer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllCustomer(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllCustomer.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllCustomer.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object getCustomerBYId(final String id, final Continuation<? super Customer> arg1) {
    final String _sql = "SELECT * FROM Customer WHERE CustomerID =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Customer>() {
      @Override
      public Customer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "Address");
          final int _cursorIndexOfCNIC = CursorUtil.getColumnIndexOrThrow(_cursor, "CNIC");
          final int _cursorIndexOfCardID = CursorUtil.getColumnIndexOrThrow(_cursor, "CardID");
          final int _cursorIndexOfCustomerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerCode");
          final int _cursorIndexOfCustomerID = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerID");
          final int _cursorIndexOfCustomerImage = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerImage");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerName");
          final int _cursorIndexOfDistributorID = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributorID");
          final int _cursorIndexOfEmailAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "EmailAddress");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "Gender");
          final int _cursorIndexOfNature = CursorUtil.getColumnIndexOrThrow(_cursor, "Nature");
          final int _cursorIndexOfOtherContactNo = CursorUtil.getColumnIndexOrThrow(_cursor, "OtherContactNo");
          final int _cursorIndexOfPoints = CursorUtil.getColumnIndexOrThrow(_cursor, "Points");
          final int _cursorIndexOfPrimaryContact = CursorUtil.getColumnIndexOrThrow(_cursor, "PrimaryContact");
          final int _cursorIndexOfProfessionID = CursorUtil.getColumnIndexOrThrow(_cursor, "ProfessionID");
          final Customer _result;
          if(_cursor.moveToFirst()) {
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpCNIC;
            if (_cursor.isNull(_cursorIndexOfCNIC)) {
              _tmpCNIC = null;
            } else {
              _tmpCNIC = _cursor.getString(_cursorIndexOfCNIC);
            }
            final String _tmpCardID;
            if (_cursor.isNull(_cursorIndexOfCardID)) {
              _tmpCardID = null;
            } else {
              _tmpCardID = _cursor.getString(_cursorIndexOfCardID);
            }
            final String _tmpCustomerCode;
            if (_cursor.isNull(_cursorIndexOfCustomerCode)) {
              _tmpCustomerCode = null;
            } else {
              _tmpCustomerCode = _cursor.getString(_cursorIndexOfCustomerCode);
            }
            final int _tmpCustomerID;
            _tmpCustomerID = _cursor.getInt(_cursorIndexOfCustomerID);
            final String _tmpCustomerImage;
            if (_cursor.isNull(_cursorIndexOfCustomerImage)) {
              _tmpCustomerImage = null;
            } else {
              _tmpCustomerImage = _cursor.getString(_cursorIndexOfCustomerImage);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final int _tmpDistributorID;
            _tmpDistributorID = _cursor.getInt(_cursorIndexOfDistributorID);
            final String _tmpEmailAddress;
            if (_cursor.isNull(_cursorIndexOfEmailAddress)) {
              _tmpEmailAddress = null;
            } else {
              _tmpEmailAddress = _cursor.getString(_cursorIndexOfEmailAddress);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final String _tmpNature;
            if (_cursor.isNull(_cursorIndexOfNature)) {
              _tmpNature = null;
            } else {
              _tmpNature = _cursor.getString(_cursorIndexOfNature);
            }
            final String _tmpOtherContactNo;
            if (_cursor.isNull(_cursorIndexOfOtherContactNo)) {
              _tmpOtherContactNo = null;
            } else {
              _tmpOtherContactNo = _cursor.getString(_cursorIndexOfOtherContactNo);
            }
            final double _tmpPoints;
            _tmpPoints = _cursor.getDouble(_cursorIndexOfPoints);
            final String _tmpPrimaryContact;
            if (_cursor.isNull(_cursorIndexOfPrimaryContact)) {
              _tmpPrimaryContact = null;
            } else {
              _tmpPrimaryContact = _cursor.getString(_cursorIndexOfPrimaryContact);
            }
            final int _tmpProfessionID;
            _tmpProfessionID = _cursor.getInt(_cursorIndexOfProfessionID);
            _result = new Customer(_tmpAddress,_tmpCNIC,_tmpCardID,_tmpCustomerCode,_tmpCustomerID,_tmpCustomerImage,_tmpCustomerName,_tmpDistributorID,_tmpEmailAddress,_tmpGender,_tmpNature,_tmpOtherContactNo,_tmpPoints,_tmpPrimaryContact,_tmpProfessionID);
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
  public Flow<List<Customer>> getAllCustomer() {
    final String _sql = "SELECT * FROM Customer";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Customer"}, new Callable<List<Customer>>() {
      @Override
      public List<Customer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "Address");
          final int _cursorIndexOfCNIC = CursorUtil.getColumnIndexOrThrow(_cursor, "CNIC");
          final int _cursorIndexOfCardID = CursorUtil.getColumnIndexOrThrow(_cursor, "CardID");
          final int _cursorIndexOfCustomerCode = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerCode");
          final int _cursorIndexOfCustomerID = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerID");
          final int _cursorIndexOfCustomerImage = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerImage");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "CustomerName");
          final int _cursorIndexOfDistributorID = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributorID");
          final int _cursorIndexOfEmailAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "EmailAddress");
          final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "Gender");
          final int _cursorIndexOfNature = CursorUtil.getColumnIndexOrThrow(_cursor, "Nature");
          final int _cursorIndexOfOtherContactNo = CursorUtil.getColumnIndexOrThrow(_cursor, "OtherContactNo");
          final int _cursorIndexOfPoints = CursorUtil.getColumnIndexOrThrow(_cursor, "Points");
          final int _cursorIndexOfPrimaryContact = CursorUtil.getColumnIndexOrThrow(_cursor, "PrimaryContact");
          final int _cursorIndexOfProfessionID = CursorUtil.getColumnIndexOrThrow(_cursor, "ProfessionID");
          final List<Customer> _result = new ArrayList<Customer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Customer _item;
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final String _tmpCNIC;
            if (_cursor.isNull(_cursorIndexOfCNIC)) {
              _tmpCNIC = null;
            } else {
              _tmpCNIC = _cursor.getString(_cursorIndexOfCNIC);
            }
            final String _tmpCardID;
            if (_cursor.isNull(_cursorIndexOfCardID)) {
              _tmpCardID = null;
            } else {
              _tmpCardID = _cursor.getString(_cursorIndexOfCardID);
            }
            final String _tmpCustomerCode;
            if (_cursor.isNull(_cursorIndexOfCustomerCode)) {
              _tmpCustomerCode = null;
            } else {
              _tmpCustomerCode = _cursor.getString(_cursorIndexOfCustomerCode);
            }
            final int _tmpCustomerID;
            _tmpCustomerID = _cursor.getInt(_cursorIndexOfCustomerID);
            final String _tmpCustomerImage;
            if (_cursor.isNull(_cursorIndexOfCustomerImage)) {
              _tmpCustomerImage = null;
            } else {
              _tmpCustomerImage = _cursor.getString(_cursorIndexOfCustomerImage);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final int _tmpDistributorID;
            _tmpDistributorID = _cursor.getInt(_cursorIndexOfDistributorID);
            final String _tmpEmailAddress;
            if (_cursor.isNull(_cursorIndexOfEmailAddress)) {
              _tmpEmailAddress = null;
            } else {
              _tmpEmailAddress = _cursor.getString(_cursorIndexOfEmailAddress);
            }
            final String _tmpGender;
            if (_cursor.isNull(_cursorIndexOfGender)) {
              _tmpGender = null;
            } else {
              _tmpGender = _cursor.getString(_cursorIndexOfGender);
            }
            final String _tmpNature;
            if (_cursor.isNull(_cursorIndexOfNature)) {
              _tmpNature = null;
            } else {
              _tmpNature = _cursor.getString(_cursorIndexOfNature);
            }
            final String _tmpOtherContactNo;
            if (_cursor.isNull(_cursorIndexOfOtherContactNo)) {
              _tmpOtherContactNo = null;
            } else {
              _tmpOtherContactNo = _cursor.getString(_cursorIndexOfOtherContactNo);
            }
            final double _tmpPoints;
            _tmpPoints = _cursor.getDouble(_cursorIndexOfPoints);
            final String _tmpPrimaryContact;
            if (_cursor.isNull(_cursorIndexOfPrimaryContact)) {
              _tmpPrimaryContact = null;
            } else {
              _tmpPrimaryContact = _cursor.getString(_cursorIndexOfPrimaryContact);
            }
            final int _tmpProfessionID;
            _tmpProfessionID = _cursor.getInt(_cursorIndexOfProfessionID);
            _item = new Customer(_tmpAddress,_tmpCNIC,_tmpCardID,_tmpCustomerCode,_tmpCustomerID,_tmpCustomerImage,_tmpCustomerName,_tmpDistributorID,_tmpEmailAddress,_tmpGender,_tmpNature,_tmpOtherContactNo,_tmpPoints,_tmpPrimaryContact,_tmpProfessionID);
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
