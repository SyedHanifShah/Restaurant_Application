package com.corn.cornpos.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CornPosDataBase_Impl extends CornPosDataBase {
  private volatile UserInfoDao _userInfoDao;

  private volatile LoginDao _loginDao;

  private volatile ProductsDao _productsDao;

  private volatile CategoryDao _categoryDao;

  private volatile DealsDao _dealsDao;

  private volatile TableDeo _tableDeo;

  private volatile CustomerDao _customerDao;

  private volatile AdsOnDao _adsOnDao;

  private volatile OrderDetailsDao _orderDetailsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserInfoModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `Can_Delivery` INTEGER NOT NULL, `Can_DineIn` INTEGER NOT NULL, `Can_TakeAway` INTEGER NOT NULL, `DealColumn` INTEGER NOT NULL, `DefaultServiceType` TEXT NOT NULL, `DefaultServiceTypeID` INTEGER NOT NULL, `DistributionID` INTEGER NOT NULL, `DistributionName` TEXT NOT NULL, `DistributorName` TEXT NOT NULL, `DistributorTypeID` INTEGER NOT NULL, `EncryptKey` TEXT NOT NULL, `IS_CanGiveDiscount` INTEGER NOT NULL, `IsDistributorRegister` INTEGER NOT NULL, `IsEncrypted` INTEGER NOT NULL, `OTPicturesManadatory` INTEGER NOT NULL, `RoleID` INTEGER NOT NULL, `UserId` INTEGER NOT NULL, `UserName` TEXT NOT NULL, `WorkingDate` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LoginModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `Access_Token` TEXT NOT NULL, `Expires` TEXT NOT NULL, `Expires_In` INTEGER NOT NULL, `Issued` TEXT NOT NULL, `Status` INTEGER NOT NULL, `Token_Type` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Products` (`ItemID` INTEGER NOT NULL, `CategoryID` INTEGER NOT NULL, `DiscountPer` INTEGER NOT NULL, `DiscountPrice` INTEGER NOT NULL, `Favourite` INTEGER NOT NULL, `ImagePath` TEXT NOT NULL, `IsAddsOn` INTEGER NOT NULL, `IsDeal` INTEGER NOT NULL, `IsHasAddsOn` INTEGER NOT NULL, `IsUnGroup` INTEGER NOT NULL, `ItemCode` TEXT NOT NULL, `ItemName` TEXT NOT NULL, `Price` REAL NOT NULL, `Rating` INTEGER NOT NULL, `SectionID` INTEGER NOT NULL, `SectionName` TEXT NOT NULL, PRIMARY KEY(`ItemID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Category` (`CategoryID` INTEGER NOT NULL, `Category` TEXT NOT NULL, `ImagePath` TEXT NOT NULL, `ParentCategoryID` INTEGER NOT NULL, `ProductCount` INTEGER NOT NULL, PRIMARY KEY(`CategoryID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Deals` (`CategoryID` INTEGER NOT NULL, `CategoryName` TEXT NOT NULL, `DealID` INTEGER NOT NULL, `DealItemQuantity` INTEGER NOT NULL, `DealItems` TEXT NOT NULL, `DealName` TEXT NOT NULL, `DealPrice` REAL NOT NULL, `intDealID` INTEGER NOT NULL, PRIMARY KEY(`intDealID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Table` (`BookingFrom` TEXT NOT NULL, `BookingTo` TEXT NOT NULL, `CustomerID` INTEGER NOT NULL, `FloorID` INTEGER NOT NULL, `FloorName` TEXT NOT NULL, `TableID` INTEGER NOT NULL, `TableNo` TEXT NOT NULL, PRIMARY KEY(`TableID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Customer` (`Address` TEXT NOT NULL, `CNIC` TEXT NOT NULL, `CardID` TEXT NOT NULL, `CustomerCode` TEXT NOT NULL, `CustomerID` INTEGER NOT NULL, `CustomerImage` TEXT NOT NULL, `CustomerName` TEXT NOT NULL, `DistributorID` INTEGER NOT NULL, `EmailAddress` TEXT NOT NULL, `Gender` TEXT NOT NULL, `Nature` TEXT NOT NULL, `OtherContactNo` TEXT NOT NULL, `Points` REAL NOT NULL, `PrimaryContact` TEXT NOT NULL, `ProfessionID` INTEGER NOT NULL, PRIMARY KEY(`CustomerID`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AdsOn` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `AdsOnCategoryID` INTEGER NOT NULL, `AdsOnCategoryName` TEXT NOT NULL, `AdsOnID` INTEGER NOT NULL, `AdsOnName` TEXT NOT NULL, `ItemID` INTEGER NOT NULL, `ItemName` TEXT NOT NULL, `IsMultiSelectModifier` INTEGER NOT NULL, `Price` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `OrderDetails` (`orderNumber` INTEGER PRIMARY KEY AUTOINCREMENT, `itemName` TEXT NOT NULL, `itemId` INTEGER NOT NULL, `quantity` INTEGER NOT NULL, `adsOnCategory` TEXT, `price` INTEGER NOT NULL, `sectionName` TEXT NOT NULL, `parentRowId` INTEGER NOT NULL, `lngDealDetailID` INTEGER, `intDealID` INTEGER, `isDeal` INTEGER NOT NULL, `parentDeal` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d6874cec28bb3458e1be86c406397ab')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `UserInfoModel`");
        _db.execSQL("DROP TABLE IF EXISTS `LoginModel`");
        _db.execSQL("DROP TABLE IF EXISTS `Products`");
        _db.execSQL("DROP TABLE IF EXISTS `Category`");
        _db.execSQL("DROP TABLE IF EXISTS `Deals`");
        _db.execSQL("DROP TABLE IF EXISTS `Table`");
        _db.execSQL("DROP TABLE IF EXISTS `Customer`");
        _db.execSQL("DROP TABLE IF EXISTS `AdsOn`");
        _db.execSQL("DROP TABLE IF EXISTS `OrderDetails`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserInfoModel = new HashMap<String, TableInfo.Column>(20);
        _columnsUserInfoModel.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("Can_Delivery", new TableInfo.Column("Can_Delivery", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("Can_DineIn", new TableInfo.Column("Can_DineIn", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("Can_TakeAway", new TableInfo.Column("Can_TakeAway", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("DealColumn", new TableInfo.Column("DealColumn", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("DefaultServiceType", new TableInfo.Column("DefaultServiceType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("DefaultServiceTypeID", new TableInfo.Column("DefaultServiceTypeID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("DistributionID", new TableInfo.Column("DistributionID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("DistributionName", new TableInfo.Column("DistributionName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("DistributorName", new TableInfo.Column("DistributorName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("DistributorTypeID", new TableInfo.Column("DistributorTypeID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("EncryptKey", new TableInfo.Column("EncryptKey", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("IS_CanGiveDiscount", new TableInfo.Column("IS_CanGiveDiscount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("IsDistributorRegister", new TableInfo.Column("IsDistributorRegister", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("IsEncrypted", new TableInfo.Column("IsEncrypted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("OTPicturesManadatory", new TableInfo.Column("OTPicturesManadatory", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("RoleID", new TableInfo.Column("RoleID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("UserId", new TableInfo.Column("UserId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("UserName", new TableInfo.Column("UserName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserInfoModel.put("WorkingDate", new TableInfo.Column("WorkingDate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserInfoModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserInfoModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserInfoModel = new TableInfo("UserInfoModel", _columnsUserInfoModel, _foreignKeysUserInfoModel, _indicesUserInfoModel);
        final TableInfo _existingUserInfoModel = TableInfo.read(_db, "UserInfoModel");
        if (! _infoUserInfoModel.equals(_existingUserInfoModel)) {
          return new RoomOpenHelper.ValidationResult(false, "UserInfoModel(com.corn.cornpos.data.database.UserInfoModel).\n"
                  + " Expected:\n" + _infoUserInfoModel + "\n"
                  + " Found:\n" + _existingUserInfoModel);
        }
        final HashMap<String, TableInfo.Column> _columnsLoginModel = new HashMap<String, TableInfo.Column>(7);
        _columnsLoginModel.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLoginModel.put("Access_Token", new TableInfo.Column("Access_Token", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLoginModel.put("Expires", new TableInfo.Column("Expires", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLoginModel.put("Expires_In", new TableInfo.Column("Expires_In", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLoginModel.put("Issued", new TableInfo.Column("Issued", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLoginModel.put("Status", new TableInfo.Column("Status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLoginModel.put("Token_Type", new TableInfo.Column("Token_Type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLoginModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLoginModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLoginModel = new TableInfo("LoginModel", _columnsLoginModel, _foreignKeysLoginModel, _indicesLoginModel);
        final TableInfo _existingLoginModel = TableInfo.read(_db, "LoginModel");
        if (! _infoLoginModel.equals(_existingLoginModel)) {
          return new RoomOpenHelper.ValidationResult(false, "LoginModel(com.corn.cornpos.data.database.LoginModel).\n"
                  + " Expected:\n" + _infoLoginModel + "\n"
                  + " Found:\n" + _existingLoginModel);
        }
        final HashMap<String, TableInfo.Column> _columnsProducts = new HashMap<String, TableInfo.Column>(16);
        _columnsProducts.put("ItemID", new TableInfo.Column("ItemID", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("CategoryID", new TableInfo.Column("CategoryID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("DiscountPer", new TableInfo.Column("DiscountPer", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("DiscountPrice", new TableInfo.Column("DiscountPrice", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("Favourite", new TableInfo.Column("Favourite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("ImagePath", new TableInfo.Column("ImagePath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("IsAddsOn", new TableInfo.Column("IsAddsOn", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("IsDeal", new TableInfo.Column("IsDeal", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("IsHasAddsOn", new TableInfo.Column("IsHasAddsOn", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("IsUnGroup", new TableInfo.Column("IsUnGroup", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("ItemCode", new TableInfo.Column("ItemCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("ItemName", new TableInfo.Column("ItemName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("Price", new TableInfo.Column("Price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("Rating", new TableInfo.Column("Rating", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("SectionID", new TableInfo.Column("SectionID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("SectionName", new TableInfo.Column("SectionName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProducts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProducts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProducts = new TableInfo("Products", _columnsProducts, _foreignKeysProducts, _indicesProducts);
        final TableInfo _existingProducts = TableInfo.read(_db, "Products");
        if (! _infoProducts.equals(_existingProducts)) {
          return new RoomOpenHelper.ValidationResult(false, "Products(com.corn.cornpos.data.database.Products).\n"
                  + " Expected:\n" + _infoProducts + "\n"
                  + " Found:\n" + _existingProducts);
        }
        final HashMap<String, TableInfo.Column> _columnsCategory = new HashMap<String, TableInfo.Column>(5);
        _columnsCategory.put("CategoryID", new TableInfo.Column("CategoryID", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("Category", new TableInfo.Column("Category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("ImagePath", new TableInfo.Column("ImagePath", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("ParentCategoryID", new TableInfo.Column("ParentCategoryID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategory.put("ProductCount", new TableInfo.Column("ProductCount", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategory = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategory = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategory = new TableInfo("Category", _columnsCategory, _foreignKeysCategory, _indicesCategory);
        final TableInfo _existingCategory = TableInfo.read(_db, "Category");
        if (! _infoCategory.equals(_existingCategory)) {
          return new RoomOpenHelper.ValidationResult(false, "Category(com.corn.cornpos.data.database.Category).\n"
                  + " Expected:\n" + _infoCategory + "\n"
                  + " Found:\n" + _existingCategory);
        }
        final HashMap<String, TableInfo.Column> _columnsDeals = new HashMap<String, TableInfo.Column>(8);
        _columnsDeals.put("CategoryID", new TableInfo.Column("CategoryID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDeals.put("CategoryName", new TableInfo.Column("CategoryName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDeals.put("DealID", new TableInfo.Column("DealID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDeals.put("DealItemQuantity", new TableInfo.Column("DealItemQuantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDeals.put("DealItems", new TableInfo.Column("DealItems", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDeals.put("DealName", new TableInfo.Column("DealName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDeals.put("DealPrice", new TableInfo.Column("DealPrice", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDeals.put("intDealID", new TableInfo.Column("intDealID", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDeals = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDeals = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDeals = new TableInfo("Deals", _columnsDeals, _foreignKeysDeals, _indicesDeals);
        final TableInfo _existingDeals = TableInfo.read(_db, "Deals");
        if (! _infoDeals.equals(_existingDeals)) {
          return new RoomOpenHelper.ValidationResult(false, "Deals(com.corn.cornpos.data.database.Deals).\n"
                  + " Expected:\n" + _infoDeals + "\n"
                  + " Found:\n" + _existingDeals);
        }
        final HashMap<String, TableInfo.Column> _columnsTable = new HashMap<String, TableInfo.Column>(7);
        _columnsTable.put("BookingFrom", new TableInfo.Column("BookingFrom", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTable.put("BookingTo", new TableInfo.Column("BookingTo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTable.put("CustomerID", new TableInfo.Column("CustomerID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTable.put("FloorID", new TableInfo.Column("FloorID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTable.put("FloorName", new TableInfo.Column("FloorName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTable.put("TableID", new TableInfo.Column("TableID", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTable.put("TableNo", new TableInfo.Column("TableNo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTable = new TableInfo("Table", _columnsTable, _foreignKeysTable, _indicesTable);
        final TableInfo _existingTable = TableInfo.read(_db, "Table");
        if (! _infoTable.equals(_existingTable)) {
          return new RoomOpenHelper.ValidationResult(false, "Table(com.corn.cornpos.data.database.Table).\n"
                  + " Expected:\n" + _infoTable + "\n"
                  + " Found:\n" + _existingTable);
        }
        final HashMap<String, TableInfo.Column> _columnsCustomer = new HashMap<String, TableInfo.Column>(15);
        _columnsCustomer.put("Address", new TableInfo.Column("Address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("CNIC", new TableInfo.Column("CNIC", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("CardID", new TableInfo.Column("CardID", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("CustomerCode", new TableInfo.Column("CustomerCode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("CustomerID", new TableInfo.Column("CustomerID", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("CustomerImage", new TableInfo.Column("CustomerImage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("CustomerName", new TableInfo.Column("CustomerName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("DistributorID", new TableInfo.Column("DistributorID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("EmailAddress", new TableInfo.Column("EmailAddress", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("Gender", new TableInfo.Column("Gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("Nature", new TableInfo.Column("Nature", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("OtherContactNo", new TableInfo.Column("OtherContactNo", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("Points", new TableInfo.Column("Points", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("PrimaryContact", new TableInfo.Column("PrimaryContact", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCustomer.put("ProfessionID", new TableInfo.Column("ProfessionID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCustomer = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCustomer = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCustomer = new TableInfo("Customer", _columnsCustomer, _foreignKeysCustomer, _indicesCustomer);
        final TableInfo _existingCustomer = TableInfo.read(_db, "Customer");
        if (! _infoCustomer.equals(_existingCustomer)) {
          return new RoomOpenHelper.ValidationResult(false, "Customer(com.corn.cornpos.data.database.Customer).\n"
                  + " Expected:\n" + _infoCustomer + "\n"
                  + " Found:\n" + _existingCustomer);
        }
        final HashMap<String, TableInfo.Column> _columnsAdsOn = new HashMap<String, TableInfo.Column>(9);
        _columnsAdsOn.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("AdsOnCategoryID", new TableInfo.Column("AdsOnCategoryID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("AdsOnCategoryName", new TableInfo.Column("AdsOnCategoryName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("AdsOnID", new TableInfo.Column("AdsOnID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("AdsOnName", new TableInfo.Column("AdsOnName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("ItemID", new TableInfo.Column("ItemID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("ItemName", new TableInfo.Column("ItemName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("IsMultiSelectModifier", new TableInfo.Column("IsMultiSelectModifier", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsOn.put("Price", new TableInfo.Column("Price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAdsOn = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAdsOn = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAdsOn = new TableInfo("AdsOn", _columnsAdsOn, _foreignKeysAdsOn, _indicesAdsOn);
        final TableInfo _existingAdsOn = TableInfo.read(_db, "AdsOn");
        if (! _infoAdsOn.equals(_existingAdsOn)) {
          return new RoomOpenHelper.ValidationResult(false, "AdsOn(com.corn.cornpos.data.database.AdsOn).\n"
                  + " Expected:\n" + _infoAdsOn + "\n"
                  + " Found:\n" + _existingAdsOn);
        }
        final HashMap<String, TableInfo.Column> _columnsOrderDetails = new HashMap<String, TableInfo.Column>(12);
        _columnsOrderDetails.put("orderNumber", new TableInfo.Column("orderNumber", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("itemName", new TableInfo.Column("itemName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("itemId", new TableInfo.Column("itemId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("adsOnCategory", new TableInfo.Column("adsOnCategory", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("sectionName", new TableInfo.Column("sectionName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("parentRowId", new TableInfo.Column("parentRowId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("lngDealDetailID", new TableInfo.Column("lngDealDetailID", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("intDealID", new TableInfo.Column("intDealID", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("isDeal", new TableInfo.Column("isDeal", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderDetails.put("parentDeal", new TableInfo.Column("parentDeal", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOrderDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOrderDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOrderDetails = new TableInfo("OrderDetails", _columnsOrderDetails, _foreignKeysOrderDetails, _indicesOrderDetails);
        final TableInfo _existingOrderDetails = TableInfo.read(_db, "OrderDetails");
        if (! _infoOrderDetails.equals(_existingOrderDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "OrderDetails(com.corn.cornpos.data.database.OrderDetails).\n"
                  + " Expected:\n" + _infoOrderDetails + "\n"
                  + " Found:\n" + _existingOrderDetails);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7d6874cec28bb3458e1be86c406397ab", "2b636c13a4ddc662adf3c8c2e2c4a7f1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "UserInfoModel","LoginModel","Products","Category","Deals","Table","Customer","AdsOn","OrderDetails");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `UserInfoModel`");
      _db.execSQL("DELETE FROM `LoginModel`");
      _db.execSQL("DELETE FROM `Products`");
      _db.execSQL("DELETE FROM `Category`");
      _db.execSQL("DELETE FROM `Deals`");
      _db.execSQL("DELETE FROM `Table`");
      _db.execSQL("DELETE FROM `Customer`");
      _db.execSQL("DELETE FROM `AdsOn`");
      _db.execSQL("DELETE FROM `OrderDetails`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserInfoDao.class, UserInfoDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LoginDao.class, LoginDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ProductsDao.class, ProductsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CategoryDao.class, CategoryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(DealsDao.class, DealsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TableDeo.class, TableDeo_Impl.getRequiredConverters());
    _typeConvertersMap.put(CustomerDao.class, CustomerDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(AdsOnDao.class, AdsOnDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OrderDetailsDao.class, OrderDetailsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public UserInfoDao getUserInfoDao() {
    if (_userInfoDao != null) {
      return _userInfoDao;
    } else {
      synchronized(this) {
        if(_userInfoDao == null) {
          _userInfoDao = new UserInfoDao_Impl(this);
        }
        return _userInfoDao;
      }
    }
  }

  @Override
  public LoginDao getLoginDao() {
    if (_loginDao != null) {
      return _loginDao;
    } else {
      synchronized(this) {
        if(_loginDao == null) {
          _loginDao = new LoginDao_Impl(this);
        }
        return _loginDao;
      }
    }
  }

  @Override
  public ProductsDao getProductsDao() {
    if (_productsDao != null) {
      return _productsDao;
    } else {
      synchronized(this) {
        if(_productsDao == null) {
          _productsDao = new ProductsDao_Impl(this);
        }
        return _productsDao;
      }
    }
  }

  @Override
  public CategoryDao getCategoryDao() {
    if (_categoryDao != null) {
      return _categoryDao;
    } else {
      synchronized(this) {
        if(_categoryDao == null) {
          _categoryDao = new CategoryDao_Impl(this);
        }
        return _categoryDao;
      }
    }
  }

  @Override
  public DealsDao getDealsDao() {
    if (_dealsDao != null) {
      return _dealsDao;
    } else {
      synchronized(this) {
        if(_dealsDao == null) {
          _dealsDao = new DealsDao_Impl(this);
        }
        return _dealsDao;
      }
    }
  }

  @Override
  public TableDeo getTableDeo() {
    if (_tableDeo != null) {
      return _tableDeo;
    } else {
      synchronized(this) {
        if(_tableDeo == null) {
          _tableDeo = new TableDeo_Impl(this);
        }
        return _tableDeo;
      }
    }
  }

  @Override
  public CustomerDao getCustomerDao() {
    if (_customerDao != null) {
      return _customerDao;
    } else {
      synchronized(this) {
        if(_customerDao == null) {
          _customerDao = new CustomerDao_Impl(this);
        }
        return _customerDao;
      }
    }
  }

  @Override
  public AdsOnDao getAdsOnDao() {
    if (_adsOnDao != null) {
      return _adsOnDao;
    } else {
      synchronized(this) {
        if(_adsOnDao == null) {
          _adsOnDao = new AdsOnDao_Impl(this);
        }
        return _adsOnDao;
      }
    }
  }

  @Override
  public OrderDetailsDao getOrderDetailsDao() {
    if (_orderDetailsDao != null) {
      return _orderDetailsDao;
    } else {
      synchronized(this) {
        if(_orderDetailsDao == null) {
          _orderDetailsDao = new OrderDetailsDao_Impl(this);
        }
        return _orderDetailsDao;
      }
    }
  }
}
