import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomePageComponent} from "./HomePage/home-page/home-page.component";
import {CustomerLoginComponent} from "./Customer/customer-login/customer-login.component";

const routes: Routes = [
  {path:'',component:HomePageComponent},
  {path:'customerLogin',component:CustomerLoginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
