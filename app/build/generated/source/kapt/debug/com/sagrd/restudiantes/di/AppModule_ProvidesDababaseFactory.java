// Generated by Dagger (https://dagger.dev).
package com.sagrd.restudiantes.di;

import android.content.Context;
import com.ucne.registroocupaciones.data.AppDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesDababaseFactory implements Factory<AppDataBase> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvidesDababaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public AppDataBase get() {
    return providesDababase(contextProvider.get());
  }

  public static AppModule_ProvidesDababaseFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvidesDababaseFactory(contextProvider);
  }

  public static AppDataBase providesDababase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesDababase(context));
  }
}
