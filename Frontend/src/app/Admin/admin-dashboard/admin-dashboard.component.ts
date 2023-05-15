import {Component, OnInit, ViewChild} from '@angular/core';
import {ChartData, ChartType} from "chart.js";
import {HttpClient} from "@angular/common/http";
import {MatCalendar} from "@angular/material/datepicker";


@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.scss']
})
export class AdminDashboardComponent implements OnInit {

  pieChartData!: ChartData<ChartType, number[], string>;
  pieChartLabels: string[] = [];
  sideBarOpen = true;
  sideBarToggler() {
    this.sideBarOpen = !this.sideBarOpen;
  }
  constructor(private http : HttpClient) { }

  ngOnInit(): void {

    this.http.get<any>('http://localhost:4000/api/v1/item/home').subscribe(data => {
      this.pieChartLabels = Object.keys(data);
      this.pieChartData = {
        labels: this.pieChartLabels,
        datasets: [
          {
            data: Object.values(data),
            backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56', 'grey'],
            hoverBackgroundColor: ['#FF6384', '#36A2EB', '#FFCE56', 'grey'],
          },
        ],
      };
    });


  }

}
