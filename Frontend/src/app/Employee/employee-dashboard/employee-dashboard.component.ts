import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Employee} from "../../Models/Employee/Employee";
import {FormBuilder, FormControl, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {EmployeeService} from "../../services/employee/employee.service";
import {Item} from "../../Models/item/Item";

@Component({
  selector: 'app-employee-dashboard',
  templateUrl: './employee-dashboard.component.html',
  styleUrls: ['./employee-dashboard.component.scss']
})
export class EmployeeDashboardComponent implements OnInit {

  sideBarOpen = true;

  editEmployee:any

  employeeId !:number
  employee!: any

  sideBarToggler() {
    this.sideBarOpen = !this.sideBarOpen;
  }
  constructor(private  formBuilder:FormBuilder,
              private Url:ActivatedRoute,
              private routes:Router,
              private employeeService:EmployeeService) {

  }

  ngOnInit(): void {
    this.employeeId =this.Url.snapshot.params['employeeId'];
    console.log(this.employeeId);

    this.employee = new Employee();
    this.employeeService.singleEmployee(this.employeeId).subscribe(data=>{
      this.employee = data;
    });

  }





}
