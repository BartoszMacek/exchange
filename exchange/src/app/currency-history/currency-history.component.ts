import { Component, OnInit } from '@angular/core';
import {ExchangeService} from '../exchange-service/exchange.service';

@Component({
  selector: 'app-currency-history',
  templateUrl: './currency-history.component.html',
  styleUrls: ['./currency-history.component.css']
})
export class CurrencyHistoryComponent implements OnInit {

  history: Array<any>;

  constructor(private exchangeService: ExchangeService) { }

  ngOnInit() {
    this.exchangeService.getHistory().subscribe(data => {
      this.history = data;
    });
  }



}
