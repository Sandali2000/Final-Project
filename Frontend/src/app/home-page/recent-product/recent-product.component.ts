import { Component, OnInit } from '@angular/core';
import {OwlOptions} from "ngx-owl-carousel-o";

@Component({
  selector: 'app-recent-product',
  templateUrl: './recent-product.component.html',
  styleUrls: ['./recent-product.component.scss']
})
export class RecentProductComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  customOptions: OwlOptions = {
    loop: true,
    autoplay:true,
    autoplaySpeed:3000,
    mouseDrag: true,
    touchDrag: false,
    pullDrag: false,
    dots:false,
    navSpeed: 700,
    navText: ['', ''],
    responsive: {
      0: {
        items: 1
      },
      400: {
        items: 2
      },
      740: {
        items: 3
      },
      940: {
        items: 4
      }
    },
    nav: true
  }

}
