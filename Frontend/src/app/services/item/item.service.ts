import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import {Item} from "../../item/Item";

@Injectable({
  providedIn: 'root'
})
export class ItemService {
  private baseURL = "http://localhost:4000/api/v1/item";
  constructor(private http:HttpClient) { }

  getAllItem(){
    return this.http.get('http://localhost:4000/api/v1/item/getAllItem');
  }
  addItem(item: any) {
    return this.http.post('http://localhost:4000/api/v1/item/save', item);
  }
  getItemById(itemId:number): Observable<Item>{
    return this.http.get<Item>(`${this.baseURL}/getById?itemId=${itemId}`);
  }
}
