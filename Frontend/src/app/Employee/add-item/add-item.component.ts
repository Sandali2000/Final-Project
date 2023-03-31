import { Component, OnInit } from '@angular/core';
import {ItemService} from "../../services/item/item.service";
import {FormBuilder, FormControl, Validators} from "@angular/forms";
import {Router} from "@angular/router";
import * as path from "path";
interface Type {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-add-item',
  templateUrl: './add-item.component.html',
  styleUrls: ['./add-item.component.scss']
})
export class AddItemComponent implements OnInit {
  item:any;
  addItem:any

  files:any
sideBarOpen = true;
  sideBarToggler() {
    this.sideBarOpen = !this.sideBarOpen;
  }
  constructor(private  fb:FormBuilder,
              private routes:Router,
              private itemService:ItemService) {
    this.addItem = fb.group(
      {

        'itemName':  new FormControl(null, Validators.required),
        'shopName': new  FormControl(null, Validators.required),
        'description':new FormControl(null,Validators.required ),
        'image':new FormControl ,
        'measureType': new  FormControl,
        'price':new  FormControl(null,Validators.required),
        'quantity': new FormControl(null,Validators.required)


      }
    );
  }

  ngOnInit(): void {
  }




  onSubmit() {
    if (this.addItem.valid) {
      console.log(this.addItem.value);
      this.itemService.addItem(this.addItem.value).subscribe((data: any) => {
        console.log(data);
        alert('Now You pay Registration Fees')
       // this.routes.navigate(['/payments']);
      })
    } else {
      alert('ERROR MESSAGE, Checked Again!!')
    }
  }
}
