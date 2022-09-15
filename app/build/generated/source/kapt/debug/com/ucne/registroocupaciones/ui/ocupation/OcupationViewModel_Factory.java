// Generated by Dagger (https://dagger.dev).
package com.ucne.registroocupaciones.ui.ocupation;

import com.ucne.registroocupaciones.repository.OcupacionRepository;
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
public final class OcupationViewModel_Factory implements Factory<OcupationViewModel> {
  private final Provider<OcupacionRepository> repositoryProvider;

  public OcupationViewModel_Factory(Provider<OcupacionRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public OcupationViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static OcupationViewModel_Factory create(
      Provider<OcupacionRepository> repositoryProvider) {
    return new OcupationViewModel_Factory(repositoryProvider);
  }

  public static OcupationViewModel newInstance(OcupacionRepository repository) {
    return new OcupationViewModel(repository);
  }
}