import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";
import {Currency} from './currency/currency.model';

@Injectable()
export class CurrencyService {

  currencyName: string;
  apiUrl = ' http://api.nbp.pl/api/exchangerates/rates/c/' + this.currencyName + '?format=json';

  constructor(private http: HttpClient) {
  }


  getCurrencyValue(): Observable<Currency> {
    return this.http.get<Currency>(this.apiUrl);

  }
}


