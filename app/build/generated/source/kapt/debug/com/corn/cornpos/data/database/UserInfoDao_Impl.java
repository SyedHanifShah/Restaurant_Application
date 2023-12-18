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
public final class UserInfoDao_Impl implements UserInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserInfoModel> __insertionAdapterOfUserInfoModel;

  private final EntityDeletionOrUpdateAdapter<UserInfoModel> __deletionAdapterOfUserInfoModel;

  public UserInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserInfoModel = new EntityInsertionAdapter<UserInfoModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserInfoModel` (`id`,`Can_Delivery`,`Can_DineIn`,`Can_TakeAway`,`DealColumn`,`DefaultServiceType`,`DefaultServiceTypeID`,`DistributionID`,`DistributionName`,`DistributorName`,`DistributorTypeID`,`EncryptKey`,`IS_CanGiveDiscount`,`IsDistributorRegister`,`IsEncrypted`,`OTPicturesManadatory`,`RoleID`,`UserId`,`UserName`,`WorkingDate`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfoModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final int _tmp = value.getCan_Delivery() ? 1 : 0;
        stmt.bindLong(2, _tmp);
        final int _tmp_1 = value.getCan_DineIn() ? 1 : 0;
        stmt.bindLong(3, _tmp_1);
        final int _tmp_2 = value.getCan_TakeAway() ? 1 : 0;
        stmt.bindLong(4, _tmp_2);
        stmt.bindLong(5, value.getDealColumn());
        if (value.getDefaultServiceType() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDefaultServiceType());
        }
        stmt.bindLong(7, value.getDefaultServiceTypeID());
        stmt.bindLong(8, value.getDistributionID());
        if (value.getDistributionName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDistributionName());
        }
        if (value.getDistributorName() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDistributorName());
        }
        stmt.bindLong(11, value.getDistributorTypeID());
        if (value.getEncryptKey() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getEncryptKey());
        }
        final int _tmp_3 = value.getIS_CanGiveDiscount() ? 1 : 0;
        stmt.bindLong(13, _tmp_3);
        stmt.bindLong(14, value.getIsDistributorRegister());
        final int _tmp_4 = value.getIsEncrypted() ? 1 : 0;
        stmt.bindLong(15, _tmp_4);
        final int _tmp_5 = value.getOTPicturesManadatory() ? 1 : 0;
        stmt.bindLong(16, _tmp_5);
        stmt.bindLong(17, value.getRoleID());
        stmt.bindLong(18, value.getUserId());
        if (value.getUserName() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getUserName());
        }
        if (value.getWorkingDate() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getWorkingDate());
        }
      }
    };
    this.__deletionAdapterOfUserInfoModel = new EntityDeletionOrUpdateAdapter<UserInfoModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserInfoModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfoModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertUserInfo(final UserInfoModel userInfoModel,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserInfoModel.insert(userInfoModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteUserInfo(final UserInfoModel userInfoModel,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUserInfoModel.handle(userInfoModel);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object getUserInfoById(final String id, final Continuation<? super UserInfoModel> arg1) {
    final String _sql = "SELECT * FROM UserInfoModel WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserInfoModel>() {
      @Override
      public UserInfoModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCanDelivery = CursorUtil.getColumnIndexOrThrow(_cursor, "Can_Delivery");
          final int _cursorIndexOfCanDineIn = CursorUtil.getColumnIndexOrThrow(_cursor, "Can_DineIn");
          final int _cursorIndexOfCanTakeAway = CursorUtil.getColumnIndexOrThrow(_cursor, "Can_TakeAway");
          final int _cursorIndexOfDealColumn = CursorUtil.getColumnIndexOrThrow(_cursor, "DealColumn");
          final int _cursorIndexOfDefaultServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "DefaultServiceType");
          final int _cursorIndexOfDefaultServiceTypeID = CursorUtil.getColumnIndexOrThrow(_cursor, "DefaultServiceTypeID");
          final int _cursorIndexOfDistributionID = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributionID");
          final int _cursorIndexOfDistributionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributionName");
          final int _cursorIndexOfDistributorName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributorName");
          final int _cursorIndexOfDistributorTypeID = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributorTypeID");
          final int _cursorIndexOfEncryptKey = CursorUtil.getColumnIndexOrThrow(_cursor, "EncryptKey");
          final int _cursorIndexOfISCanGiveDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "IS_CanGiveDiscount");
          final int _cursorIndexOfIsDistributorRegister = CursorUtil.getColumnIndexOrThrow(_cursor, "IsDistributorRegister");
          final int _cursorIndexOfIsEncrypted = CursorUtil.getColumnIndexOrThrow(_cursor, "IsEncrypted");
          final int _cursorIndexOfOTPicturesManadatory = CursorUtil.getColumnIndexOrThrow(_cursor, "OTPicturesManadatory");
          final int _cursorIndexOfRoleID = CursorUtil.getColumnIndexOrThrow(_cursor, "RoleID");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "UserId");
          final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "UserName");
          final int _cursorIndexOfWorkingDate = CursorUtil.getColumnIndexOrThrow(_cursor, "WorkingDate");
          final UserInfoModel _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final boolean _tmpCan_Delivery;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCanDelivery);
            _tmpCan_Delivery = _tmp != 0;
            final boolean _tmpCan_DineIn;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfCanDineIn);
            _tmpCan_DineIn = _tmp_1 != 0;
            final boolean _tmpCan_TakeAway;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfCanTakeAway);
            _tmpCan_TakeAway = _tmp_2 != 0;
            final int _tmpDealColumn;
            _tmpDealColumn = _cursor.getInt(_cursorIndexOfDealColumn);
            final String _tmpDefaultServiceType;
            if (_cursor.isNull(_cursorIndexOfDefaultServiceType)) {
              _tmpDefaultServiceType = null;
            } else {
              _tmpDefaultServiceType = _cursor.getString(_cursorIndexOfDefaultServiceType);
            }
            final int _tmpDefaultServiceTypeID;
            _tmpDefaultServiceTypeID = _cursor.getInt(_cursorIndexOfDefaultServiceTypeID);
            final int _tmpDistributionID;
            _tmpDistributionID = _cursor.getInt(_cursorIndexOfDistributionID);
            final String _tmpDistributionName;
            if (_cursor.isNull(_cursorIndexOfDistributionName)) {
              _tmpDistributionName = null;
            } else {
              _tmpDistributionName = _cursor.getString(_cursorIndexOfDistributionName);
            }
            final String _tmpDistributorName;
            if (_cursor.isNull(_cursorIndexOfDistributorName)) {
              _tmpDistributorName = null;
            } else {
              _tmpDistributorName = _cursor.getString(_cursorIndexOfDistributorName);
            }
            final int _tmpDistributorTypeID;
            _tmpDistributorTypeID = _cursor.getInt(_cursorIndexOfDistributorTypeID);
            final String _tmpEncryptKey;
            if (_cursor.isNull(_cursorIndexOfEncryptKey)) {
              _tmpEncryptKey = null;
            } else {
              _tmpEncryptKey = _cursor.getString(_cursorIndexOfEncryptKey);
            }
            final boolean _tmpIS_CanGiveDiscount;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfISCanGiveDiscount);
            _tmpIS_CanGiveDiscount = _tmp_3 != 0;
            final int _tmpIsDistributorRegister;
            _tmpIsDistributorRegister = _cursor.getInt(_cursorIndexOfIsDistributorRegister);
            final boolean _tmpIsEncrypted;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsEncrypted);
            _tmpIsEncrypted = _tmp_4 != 0;
            final boolean _tmpOTPicturesManadatory;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfOTPicturesManadatory);
            _tmpOTPicturesManadatory = _tmp_5 != 0;
            final int _tmpRoleID;
            _tmpRoleID = _cursor.getInt(_cursorIndexOfRoleID);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final String _tmpUserName;
            if (_cursor.isNull(_cursorIndexOfUserName)) {
              _tmpUserName = null;
            } else {
              _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
            }
            final String _tmpWorkingDate;
            if (_cursor.isNull(_cursorIndexOfWorkingDate)) {
              _tmpWorkingDate = null;
            } else {
              _tmpWorkingDate = _cursor.getString(_cursorIndexOfWorkingDate);
            }
            _result = new UserInfoModel(_tmpId,_tmpCan_Delivery,_tmpCan_DineIn,_tmpCan_TakeAway,_tmpDealColumn,_tmpDefaultServiceType,_tmpDefaultServiceTypeID,_tmpDistributionID,_tmpDistributionName,_tmpDistributorName,_tmpDistributorTypeID,_tmpEncryptKey,_tmpIS_CanGiveDiscount,_tmpIsDistributorRegister,_tmpIsEncrypted,_tmpOTPicturesManadatory,_tmpRoleID,_tmpUserId,_tmpUserName,_tmpWorkingDate);
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
  public Flow<UserInfoModel> getAllUserInfo() {
    final String _sql = "SELECT * FROM UserInfoModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"UserInfoModel"}, new Callable<UserInfoModel>() {
      @Override
      public UserInfoModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCanDelivery = CursorUtil.getColumnIndexOrThrow(_cursor, "Can_Delivery");
          final int _cursorIndexOfCanDineIn = CursorUtil.getColumnIndexOrThrow(_cursor, "Can_DineIn");
          final int _cursorIndexOfCanTakeAway = CursorUtil.getColumnIndexOrThrow(_cursor, "Can_TakeAway");
          final int _cursorIndexOfDealColumn = CursorUtil.getColumnIndexOrThrow(_cursor, "DealColumn");
          final int _cursorIndexOfDefaultServiceType = CursorUtil.getColumnIndexOrThrow(_cursor, "DefaultServiceType");
          final int _cursorIndexOfDefaultServiceTypeID = CursorUtil.getColumnIndexOrThrow(_cursor, "DefaultServiceTypeID");
          final int _cursorIndexOfDistributionID = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributionID");
          final int _cursorIndexOfDistributionName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributionName");
          final int _cursorIndexOfDistributorName = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributorName");
          final int _cursorIndexOfDistributorTypeID = CursorUtil.getColumnIndexOrThrow(_cursor, "DistributorTypeID");
          final int _cursorIndexOfEncryptKey = CursorUtil.getColumnIndexOrThrow(_cursor, "EncryptKey");
          final int _cursorIndexOfISCanGiveDiscount = CursorUtil.getColumnIndexOrThrow(_cursor, "IS_CanGiveDiscount");
          final int _cursorIndexOfIsDistributorRegister = CursorUtil.getColumnIndexOrThrow(_cursor, "IsDistributorRegister");
          final int _cursorIndexOfIsEncrypted = CursorUtil.getColumnIndexOrThrow(_cursor, "IsEncrypted");
          final int _cursorIndexOfOTPicturesManadatory = CursorUtil.getColumnIndexOrThrow(_cursor, "OTPicturesManadatory");
          final int _cursorIndexOfRoleID = CursorUtil.getColumnIndexOrThrow(_cursor, "RoleID");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "UserId");
          final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "UserName");
          final int _cursorIndexOfWorkingDate = CursorUtil.getColumnIndexOrThrow(_cursor, "WorkingDate");
          final UserInfoModel _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final boolean _tmpCan_Delivery;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCanDelivery);
            _tmpCan_Delivery = _tmp != 0;
            final boolean _tmpCan_DineIn;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfCanDineIn);
            _tmpCan_DineIn = _tmp_1 != 0;
            final boolean _tmpCan_TakeAway;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfCanTakeAway);
            _tmpCan_TakeAway = _tmp_2 != 0;
            final int _tmpDealColumn;
            _tmpDealColumn = _cursor.getInt(_cursorIndexOfDealColumn);
            final String _tmpDefaultServiceType;
            if (_cursor.isNull(_cursorIndexOfDefaultServiceType)) {
              _tmpDefaultServiceType = null;
            } else {
              _tmpDefaultServiceType = _cursor.getString(_cursorIndexOfDefaultServiceType);
            }
            final int _tmpDefaultServiceTypeID;
            _tmpDefaultServiceTypeID = _cursor.getInt(_cursorIndexOfDefaultServiceTypeID);
            final int _tmpDistributionID;
            _tmpDistributionID = _cursor.getInt(_cursorIndexOfDistributionID);
            final String _tmpDistributionName;
            if (_cursor.isNull(_cursorIndexOfDistributionName)) {
              _tmpDistributionName = null;
            } else {
              _tmpDistributionName = _cursor.getString(_cursorIndexOfDistributionName);
            }
            final String _tmpDistributorName;
            if (_cursor.isNull(_cursorIndexOfDistributorName)) {
              _tmpDistributorName = null;
            } else {
              _tmpDistributorName = _cursor.getString(_cursorIndexOfDistributorName);
            }
            final int _tmpDistributorTypeID;
            _tmpDistributorTypeID = _cursor.getInt(_cursorIndexOfDistributorTypeID);
            final String _tmpEncryptKey;
            if (_cursor.isNull(_cursorIndexOfEncryptKey)) {
              _tmpEncryptKey = null;
            } else {
              _tmpEncryptKey = _cursor.getString(_cursorIndexOfEncryptKey);
            }
            final boolean _tmpIS_CanGiveDiscount;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfISCanGiveDiscount);
            _tmpIS_CanGiveDiscount = _tmp_3 != 0;
            final int _tmpIsDistributorRegister;
            _tmpIsDistributorRegister = _cursor.getInt(_cursorIndexOfIsDistributorRegister);
            final boolean _tmpIsEncrypted;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfIsEncrypted);
            _tmpIsEncrypted = _tmp_4 != 0;
            final boolean _tmpOTPicturesManadatory;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfOTPicturesManadatory);
            _tmpOTPicturesManadatory = _tmp_5 != 0;
            final int _tmpRoleID;
            _tmpRoleID = _cursor.getInt(_cursorIndexOfRoleID);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final String _tmpUserName;
            if (_cursor.isNull(_cursorIndexOfUserName)) {
              _tmpUserName = null;
            } else {
              _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
            }
            final String _tmpWorkingDate;
            if (_cursor.isNull(_cursorIndexOfWorkingDate)) {
              _tmpWorkingDate = null;
            } else {
              _tmpWorkingDate = _cursor.getString(_cursorIndexOfWorkingDate);
            }
            _result = new UserInfoModel(_tmpId,_tmpCan_Delivery,_tmpCan_DineIn,_tmpCan_TakeAway,_tmpDealColumn,_tmpDefaultServiceType,_tmpDefaultServiceTypeID,_tmpDistributionID,_tmpDistributionName,_tmpDistributorName,_tmpDistributorTypeID,_tmpEncryptKey,_tmpIS_CanGiveDiscount,_tmpIsDistributorRegister,_tmpIsEncrypted,_tmpOTPicturesManadatory,_tmpRoleID,_tmpUserId,_tmpUserName,_tmpWorkingDate);
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
