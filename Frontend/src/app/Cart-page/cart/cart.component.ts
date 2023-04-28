import { Component, OnInit } from '@angular/core';
import {Cart} from "../../Models/cart/cart";
import {CartItem} from "../../Models/cart/CartItem";
import {CartService} from "../../services/cart/cart.service";
import {CustomerLoginComponent} from "../../Customer/customer-login/customer-login.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.scss']
})
export class CartComponent implements OnInit {
  cart!:Cart;
  constructor(private cartService:CartService,
              public dialog: MatDialog) {
    this.setCart();
  }
  openDialog() {
    this.dialog.open(CustomerLoginComponent, {
      width:'450px',
      height:'530px'

    });
  }
  ngOnInit(): void {


}

  setCart(){
    this.cart=this.cartService.getCart();
  }

  removeFromCart(cartItem: CartItem){
    this.cartService.removeFromCart((cartItem.item.itemId));
    this.setCart();
  }

  changeQuantity(cartItem: CartItem, quantityInString:string){
    const  quantity=parseInt(quantityInString);
    this.cartService.changeQuantity(cartItem.item.itemId, quantity);
    this.setCart();
  }



}
