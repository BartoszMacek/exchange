import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable()
export class ExchangeService {

  constructor(private http: HttpClient) {
  }

  getHistory(): Observable<any> {
    return this.http.get('http://localhost:5050/history');
  }


}
