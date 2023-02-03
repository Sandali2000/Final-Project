import { Component, OnInit } from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {DialogLoginComponent} from "../dialog-login/dialog-login.component";

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.scss']
})
export class DialogComponent implements OnInit {

  constructor(public dialog: MatDialog) { }
  openDialog1() {
    this.dialog.open(DialogLoginComponent, {
      width:'450px',
      height:'530px'

    });
  }
  ngOnInit(): void {
  }

}
