import {Component, OnInit, ViewChild} from '@angular/core';
import {NgForm} from "@angular/forms";
import {Currency} from "./currency.model";
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Component({
  selector: 'app-currency',
  templateUrl: './currency.component.html',
  styleUrls: ['./currency.component.css']
})
export class CurrencyComponent implements OnInit {

  @ViewChild('f') currencyForm: NgForm;

  currency$: Currency;

  currencyName: string;


  apiUrl = ' http://api.nbp.pl/api/exchangerates/rates/c/' + this.currencyName + '?format=json';

  constructor(private httpClient: HttpClient,
              private router: Router) {
  }

  ngOnInit() {
  }

  onSubmit() {
    this.currencyName = (this.currencyForm.value.currencyName);
  }

  onHistory() {
    this.router.navigate(['history'])
  }
}


