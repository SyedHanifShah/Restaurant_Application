// Generated by Dagger (https://dagger.dev).
package com.corn.cornpos.ui.screen.takeaway;

import android.content.Context;
import com.corn.cornpos.repository.CornDataBaseRepository;
import com.corn.cornpos.repository.CornPosRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TakeAwayViewModel_Factory implements Factory<TakeAwayViewModel> {
  private final Provider<CornPosRepository> repositoryProvider;

  private final Provider<CornDataBaseRepository> dataBaseRepositoryProvider;

  private final Provider<Context> applicationProvider;

  public TakeAwayViewModel_Factory(Provider<CornPosRepository> repositoryProvider,
      Provider<CornDataBaseRepository> dataBaseRepositoryProvider,
      Provider<Context> applicationProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dataBaseRepositoryProvider = dataBaseRepositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public TakeAwayViewModel get() {
    return newInstance(repositoryProvider.get(), dataBaseRepositoryProvider.get(), applicationProvider.get());
  }

  public static TakeAwayViewModel_Factory create(Provider<CornPosRepository> repositoryProvider,
      Provider<CornDataBaseRepository> dataBaseRepositoryProvider,
      Provider<Context> applicationProvider) {
    return new TakeAwayViewModel_Factory(repositoryProvider, dataBaseRepositoryProvider, applicationProvider);
  }

  public static TakeAwayViewModel newInstance(CornPosRepository repository,
      CornDataBaseRepository dataBaseRepository, Context application) {
    return new TakeAwayViewModel(repository, dataBaseRepository, application);
  }
}
