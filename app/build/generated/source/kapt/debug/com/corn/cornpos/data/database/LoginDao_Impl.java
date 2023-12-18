package com.corn.cornpos.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LoginDao_Impl implements LoginDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LoginModel> __insertionAdapterOfLoginModel;

  private final EntityDeletionOrUpdateAdapter<LoginModel> __deletionAdapterOfLoginModel;

  public LoginDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLoginModel = new EntityInsertionAdapter<LoginModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `LoginModel` (`id`,`Access_Token`,`Expires`,`Expires_In`,`Issued`,`Status`,`Token_Type`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoginModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getAccess_Token() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAccess_Token());
        }
        if (value.getExpires() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getExpires());
        }
        stmt.bindLong(4, value.getExpires_In());
        if (value.getIssued() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIssued());
        }
        final int _tmp = value.getStatus() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        if (value.getToken_Type() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getToken_Type());
        }
      }
    };
    this.__deletionAdapterOfLoginModel = new EntityDeletionOrUpdateAdapter<LoginModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `LoginModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoginModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertLoginData(final LoginModel loginModel,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLoginModel.insert(loginModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteLoginData(final LoginModel loginModel,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfLoginModel.handle(loginModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object getLoginDataById(final String id, final Continuation<? super LoginModel> arg1) {
    final String _sql = "SELECT * FROM LoginModel WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<LoginModel>() {
      @Override
      public LoginModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAccessToken = CursorUtil.getColumnIndexOrThrow(_cursor, "Access_Token");
          final int _cursorIndexOfExpires = CursorUtil.getColumnIndexOrThrow(_cursor, "Expires");
          final int _cursorIndexOfExpiresIn = CursorUtil.getColumnIndexOrThrow(_cursor, "Expires_In");
          final int _cursorIndexOfIssued = CursorUtil.getColumnIndexOrThrow(_cursor, "Issued");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "Status");
          final int _cursorIndexOfTokenType = CursorUtil.getColumnIndexOrThrow(_cursor, "Token_Type");
          final LoginModel _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpAccess_Token;
            if (_cursor.isNull(_cursorIndexOfAccessToken)) {
              _tmpAccess_Token = null;
            } else {
              _tmpAccess_Token = _cursor.getString(_cursorIndexOfAccessToken);
            }
            final String _tmpExpires;
            if (_cursor.isNull(_cursorIndexOfExpires)) {
              _tmpExpires = null;
            } else {
              _tmpExpires = _cursor.getString(_cursorIndexOfExpires);
            }
            final int _tmpExpires_In;
            _tmpExpires_In = _cursor.getInt(_cursorIndexOfExpiresIn);
            final String _tmpIssued;
            if (_cursor.isNull(_cursorIndexOfIssued)) {
              _tmpIssued = null;
            } else {
              _tmpIssued = _cursor.getString(_cursorIndexOfIssued);
            }
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            final String _tmpToken_Type;
            if (_cursor.isNull(_cursorIndexOfTokenType)) {
              _tmpToken_Type = null;
            } else {
              _tmpToken_Type = _cursor.getString(_cursorIndexOfTokenType);
            }
            _result = new LoginModel(_tmpId,_tmpAccess_Token,_tmpExpires,_tmpExpires_In,_tmpIssued,_tmpStatus,_tmpToken_Type);
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
  public Flow<LoginModel> getAllLoginData() {
    final String _sql = "SELECT * FROM LoginModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"LoginModel"}, new Callable<LoginModel>() {
      @Override
      public LoginModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAccessToken = CursorUtil.getColumnIndexOrThrow(_cursor, "Access_Token");
          final int _cursorIndexOfExpires = CursorUtil.getColumnIndexOrThrow(_cursor, "Expires");
          final int _cursorIndexOfExpiresIn = CursorUtil.getColumnIndexOrThrow(_cursor, "Expires_In");
          final int _cursorIndexOfIssued = CursorUtil.getColumnIndexOrThrow(_cursor, "Issued");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "Status");
          final int _cursorIndexOfTokenType = CursorUtil.getColumnIndexOrThrow(_cursor, "Token_Type");
          final LoginModel _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpAccess_Token;
            if (_cursor.isNull(_cursorIndexOfAccessToken)) {
              _tmpAccess_Token = null;
            } else {
              _tmpAccess_Token = _cursor.getString(_cursorIndexOfAccessToken);
            }
            final String _tmpExpires;
            if (_cursor.isNull(_cursorIndexOfExpires)) {
              _tmpExpires = null;
            } else {
              _tmpExpires = _cursor.getString(_cursorIndexOfExpires);
            }
            final int _tmpExpires_In;
            _tmpExpires_In = _cursor.getInt(_cursorIndexOfExpiresIn);
            final String _tmpIssued;
            if (_cursor.isNull(_cursorIndexOfIssued)) {
              _tmpIssued = null;
            } else {
              _tmpIssued = _cursor.getString(_cursorIndexOfIssued);
            }
            final boolean _tmpStatus;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStatus);
            _tmpStatus = _tmp != 0;
            final String _tmpToken_Type;
            if (_cursor.isNull(_cursorIndexOfTokenType)) {
              _tmpToken_Type = null;
            } else {
              _tmpToken_Type = _cursor.getString(_cursorIndexOfTokenType);
            }
            _result = new LoginModel(_tmpId,_tmpAccess_Token,_tmpExpires,_tmpExpires_In,_tmpIssued,_tmpStatus,_tmpToken_Type);
          } else {
            _result = null;
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
