import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-home',
  templateUrl: './employee-home.component.html',
  styleUrls: ['./employee-home.component.scss']
})
export class EmployeeHomeComponent implements OnInit {
  sideBarOpen = true;

  sideBarToggler() {
    this.sideBarOpen = !this.sideBarOpen;
  }
  constructor() { }

  ngOnInit(): void {
  }

}
