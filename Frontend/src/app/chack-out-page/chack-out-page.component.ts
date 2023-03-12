import { Component, OnInit } from '@angular/core';
import {OrdersModule} from "../Models/orders/orders.module";
import {render} from "creditcardpayments/creditCardPayments";
@Component({
  selector: 'app-chack-out-page',
  templateUrl: './chack-out-page.component.html',
  styleUrls: ['./chack-out-page.component.scss']
})
export class ChackOutPageComponent implements OnInit {
  order:OrdersModule = new OrdersModule();
  constructor() { }

  ngOnInit(): void {
    render({
      id: "#myPaypalButton",
      currency: "USD",
      value: "45.00",
      onApprove: (details) => {
        alert("Transaction Successfully")
      }

    });
  }

}
