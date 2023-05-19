import { Component, OnInit } from '@angular/core';
import {ProductService} from "../../services/product/product.service";
import {ActivatedRoute} from "@angular/router";
import {OwlOptions} from "ngx-owl-carousel-o";

@Component({
  selector: 'app-product-page',
  templateUrl: './product-page.component.html',
  styleUrls: ['./product-page.component.scss']
})
export class ProductPageComponent implements OnInit {
  product:any
  totalLength:any;
  page:number =1;
  searchText:any;

  constructor(private productService:ProductService,
              private rout:ActivatedRoute) { }

  ngOnInit(): void {


    this.loadProduct()
      this.productService.viewItem().subscribe((result)=>{
        this.product =result;

      })

  }
  customOptions: OwlOptions = {
    loop: true,
    mouseDrag: true,
    touchDrag: true,
    pullDrag: false,
    dots: false,
    autoplay:true,
    autoplaySpeed:700,
    navSpeed: 700,
    navText: ['', ''],
    responsive: {
      0: {
        items: 1
      },
      400: {
        items: 1
      },
      740: {
        items: 1
      },
      940: {
        items: 1
      }
    },
    nav: true
  }

  loadProduct(){
    this.productService.viewItem().subscribe((data:any)=>{
      console.log(data);
      this.product = data;
    })
  }


}
