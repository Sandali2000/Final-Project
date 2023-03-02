import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http:HttpClient) { }


  addCustomer(customer: any) {
    return this.http.post('http://localhost:4000/api/v1/customer/save', customer);
  }
}
