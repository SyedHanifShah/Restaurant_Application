// Generated by Dagger (https://dagger.dev).
package com.corn.cornpos.repository;

import com.corn.cornpos.data.database.AdsOnDao;
import com.corn.cornpos.data.database.CategoryDao;
import com.corn.cornpos.data.database.CustomerDao;
import com.corn.cornpos.data.database.DealsDao;
import com.corn.cornpos.data.database.LoginDao;
import com.corn.cornpos.data.database.OrderDetailsDao;
import com.corn.cornpos.data.database.ProductsDao;
import com.corn.cornpos.data.database.TableDeo;
import com.corn.cornpos.data.database.UserInfoDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CornPosDataBaseRepositoryImpl_Factory implements Factory<CornPosDataBaseRepositoryImpl> {
  private final Provider<UserInfoDao> userInfoDaoProvider;

  private final Provider<LoginDao> loginDaoProvider;

  private final Provider<ProductsDao> productsDaoProvider;

  private final Provider<CategoryDao> categoryDaoProvider;

  private final Provider<DealsDao> dealsDaoProvider;

  private final Provider<TableDeo> tableDeoProvider;

  private final Provider<CustomerDao> customerDaoProvider;

  private final Provider<AdsOnDao> adsOnDaoProvider;

  private final Provider<OrderDetailsDao> orderDetailsDaoProvider;

  public CornPosDataBaseRepositoryImpl_Factory(Provider<UserInfoDao> userInfoDaoProvider,
      Provider<LoginDao> loginDaoProvider, Provider<ProductsDao> productsDaoProvider,
      Provider<CategoryDao> categoryDaoProvider, Provider<DealsDao> dealsDaoProvider,
      Provider<TableDeo> tableDeoProvider, Provider<CustomerDao> customerDaoProvider,
      Provider<AdsOnDao> adsOnDaoProvider, Provider<OrderDetailsDao> orderDetailsDaoProvider) {
    this.userInfoDaoProvider = userInfoDaoProvider;
    this.loginDaoProvider = loginDaoProvider;
    this.productsDaoProvider = productsDaoProvider;
    this.categoryDaoProvider = categoryDaoProvider;
    this.dealsDaoProvider = dealsDaoProvider;
    this.tableDeoProvider = tableDeoProvider;
    this.customerDaoProvider = customerDaoProvider;
    this.adsOnDaoProvider = adsOnDaoProvider;
    this.orderDetailsDaoProvider = orderDetailsDaoProvider;
  }

  @Override
  public CornPosDataBaseRepositoryImpl get() {
    return newInstance(userInfoDaoProvider.get(), loginDaoProvider.get(), productsDaoProvider.get(), categoryDaoProvider.get(), dealsDaoProvider.get(), tableDeoProvider.get(), customerDaoProvider.get(), adsOnDaoProvider.get(), orderDetailsDaoProvider.get());
  }

  public static CornPosDataBaseRepositoryImpl_Factory create(
      Provider<UserInfoDao> userInfoDaoProvider, Provider<LoginDao> loginDaoProvider,
      Provider<ProductsDao> productsDaoProvider, Provider<CategoryDao> categoryDaoProvider,
      Provider<DealsDao> dealsDaoProvider, Provider<TableDeo> tableDeoProvider,
      Provider<CustomerDao> customerDaoProvider, Provider<AdsOnDao> adsOnDaoProvider,
      Provider<OrderDetailsDao> orderDetailsDaoProvider) {
    return new CornPosDataBaseRepositoryImpl_Factory(userInfoDaoProvider, loginDaoProvider, productsDaoProvider, categoryDaoProvider, dealsDaoProvider, tableDeoProvider, customerDaoProvider, adsOnDaoProvider, orderDetailsDaoProvider);
  }

  public static CornPosDataBaseRepositoryImpl newInstance(UserInfoDao userInfoDao,
      LoginDao loginDao, ProductsDao productsDao, CategoryDao categoryDao, DealsDao dealsDao,
      TableDeo tableDeo, CustomerDao customerDao, AdsOnDao adsOnDao,
      OrderDetailsDao orderDetailsDao) {
    return new CornPosDataBaseRepositoryImpl(userInfoDao, loginDao, productsDao, categoryDao, dealsDao, tableDeo, customerDao, adsOnDao, orderDetailsDao);
  }
}