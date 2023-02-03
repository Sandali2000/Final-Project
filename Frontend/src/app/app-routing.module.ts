import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./home-page/home/home.component";
import {ProductComponent} from "./product-page/product/product.component";
import {EmployeeHomeComponent} from "./employee/employee-home/employee-home.component";
import{LoginComponent} from "./employee/login/login.component";
import {AdminLoginComponent} from "./admin/admin-login/admin-login.component";
import{AgreementFormComponent} from "./employee/agreement-form/agreement-form.component";
import {ContactUsComponent} from "./home-page/contact-us/contact-us.component";

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'product',component:ProductComponent},
  {path:'employee',component:EmployeeHomeComponent},
  {path:'employee-login',component:LoginComponent},
  {path:'admin-login',component:AdminLoginComponent},
  {path:'AgreementForm',component:AgreementFormComponent},
  {path:'contact-us',component:ContactUsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
