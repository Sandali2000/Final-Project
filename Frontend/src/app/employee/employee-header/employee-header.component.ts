import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-employee-header',
  templateUrl: './employee-header.component.html',
  styleUrls: ['./employee-header.component.scss']
})
export class EmployeeHeaderComponent implements OnInit {
  @Output() toggleSidebarForMe: EventEmitter<any>=new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }
  toggleSidebar(){
    this.toggleSidebarForMe.emit();
  }
}
