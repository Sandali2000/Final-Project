import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private http:HttpClient) { }

  getAllItem(){
    return this.http.get('http://localhost:4000/api/v1/item/getAllItem');
  }
}
