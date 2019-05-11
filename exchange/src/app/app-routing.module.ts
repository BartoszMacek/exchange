import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CurrencyHistoryComponent} from "./currency-history/currency-history.component";

const routes: Routes = [
  {path: 'history', component: CurrencyHistoryComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
