import { Component, OnInit } from '@angular/core';
import{MatDialog} from "@angular/material/dialog";
import {CustomerLoginComponent} from "../customer-login/customer-login.component";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor(public dialog: MatDialog) { }

  ngOnInit(): void {
  }
  openDialog1() {
    this.dialog.open(CustomerLoginComponent, {
      width:'450px',
      height:'530px'

    });
  }

}
