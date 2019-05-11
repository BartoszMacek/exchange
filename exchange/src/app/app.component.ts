import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {


  constructor() {
  }

  ngOnInit() {
  }


  // onSubmit(element: NgForm) {
  //   this.currencyName = (this.currencyService.getCurrencyValue(element.value.currencyName));
  //   console.log(this.currencyService.getCurrencyValue(element.value.currencyName))
  // }


}
