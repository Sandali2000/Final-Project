import { Component, OnInit } from '@angular/core';
import {ItemService} from "../../services/item/item.service";
import {FormBuilder, FormControl, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import * as path from "path";
import {Employee} from "../../Models/Employee/Employee";
import {EmployeeService} from "../../services/employee/employee.service";
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

  employeeId !:number
  employee!: any
  files:any

  // selectedTeam = '';
  // onSelected(value:string): void {
  //   this.selectedTeam = value;
  // }

  sideBarOpen = true;


  sideBarToggler() {
    this.sideBarOpen = !this.sideBarOpen;
  }
  constructor(private  fb:FormBuilder,
              private routes:Router,
              private itemService:ItemService,
              private Url:ActivatedRoute,
              private employeeService:EmployeeService) {
    this.addItem = fb.group(
        {

          'itemName':  new FormControl(null, Validators.required),
          'shopName': new  FormControl(null, Validators.required),
          'employeeId': new  FormControl(null, Validators.required),
          'description':new FormControl(null,Validators.required ),
          'image':new FormControl ,
          'itemType': new  FormControl(null,Validators.required),
          'date': new  FormControl(null,Validators.required),
          'price':new  FormControl(null,Validators.required),
          'quantity': new FormControl(null,Validators.required)


        }
    );
  }

  ngOnInit(): void {
    this.employeeId =this.Url.snapshot.params['employeeId'];
    console.log(this.employeeId);

    this.employee = new Employee();
    this.employeeService.singleEmployee(this.employeeId).subscribe(data=>{
      this.employee = data;
    });
  }




  onSubmit() {
    if (this.addItem.valid) {
      console.log(this.addItem.value);
      this.itemService.addItem(this.addItem.value).subscribe((data: any) => {
        console.log(data);
        alert('Now You Register')
        // this.routes.navigate(['/payments']);
      })
    } else {
      alert('ERROR MESSAGE, Checked Again!!')
    }
  }

}
