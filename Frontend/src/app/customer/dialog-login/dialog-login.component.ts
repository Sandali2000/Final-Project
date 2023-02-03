import { Component, OnInit } from '@angular/core';
import {DialogComponent} from "../dialog/dialog.component";
import {MatDialog} from "@angular/material/dialog";

@Component({
  selector: 'app-dialog-login',
  templateUrl: './dialog-login.component.html',
  styleUrls: ['./dialog-login.component.scss']
})
export class DialogLoginComponent implements OnInit {

  constructor(public dialog: MatDialog) { }
  openDialog1() {
    this.dialog.open(DialogComponent, {
      width:'450px',
      height:'530px'

    });
  }
  ngOnInit(): void {
  }

}
