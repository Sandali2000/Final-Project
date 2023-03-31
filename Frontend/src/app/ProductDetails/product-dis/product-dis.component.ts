import { Component, OnInit } from '@angular/core';
import {ItemService} from "../../services/item/item.service";
import {ActivatedRoute} from "@angular/router";
import {Item} from "../../item/Item";

@Component({
  selector: 'app-product-dis',
  templateUrl: './product-dis.component.html',
  styleUrls: ['./product-dis.component.scss']
})
export class ProductDisComponent implements OnInit {
  itemId !:number
  item!: any
  constructor(private Url:ActivatedRoute,
              private  itemService:ItemService) { }

  ngOnInit(): void {

    this.itemId = this.Url.snapshot.params['itemId'];

    this.item = new Item();
    this.itemService.getItemById(this.itemId).subscribe(data=>{
      this.item = data;
    });
  }

  loadStudent() {

    this.itemService.getItemById(this.itemId).subscribe((data: any) => {
      //console.log(data);
      this.item = data;
    })
  }
}
