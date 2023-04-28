import { Component, OnInit } from '@angular/core';
import {ItemService} from "../../services/item/item.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Item} from "../../Models/item/Item";
import {CartService} from "../../services/cart/cart.service";

@Component({
  selector: 'app-product-dis',
  templateUrl: './product-dis.component.html',
  styleUrls: ['./product-dis.component.scss']
})
export class ProductDisComponent implements OnInit {
  itemId !:number
  item!: any
  constructor(private Url:ActivatedRoute,
              private  itemService:ItemService,
              private cartService:CartService,
              private router:Router) { }

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

  addToCart(){
    this.cartService.addToCart(this.item);
    this.router.navigateByUrl('/cartPage')
  }
}
