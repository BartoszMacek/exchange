import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {CurrencyComponent} from './currency/currency.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import {CurrencyHistoryComponent} from './currency-history/currency-history.component';
import {ExchangeService} from './exchange-service/exchange.service';

@NgModule({
  declarations: [
    AppComponent,
    CurrencyComponent,
    CurrencyHistoryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ExchangeService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
