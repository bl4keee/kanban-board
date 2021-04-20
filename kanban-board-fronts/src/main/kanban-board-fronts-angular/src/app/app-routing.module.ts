import { NgModule } from '@angular/core';
import {Routes, RouterModule} from "@angular/router";
import {MainViewComponent} from "./components/main-view/main-view.component";

const routes: Routes = [
  {path: '', component: MainViewComponent}
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }