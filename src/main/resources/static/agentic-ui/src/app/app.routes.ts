import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ChatUiComponent } from './chat-ui/chat-ui.component';
import { TransactionUiComponent } from './transaction-ui/transaction-ui.component';
import {TransactionsComponent} from './transactions/transactions.component'
export const routes: Routes = [
  { path: 'chat', component: ChatUiComponent },
  {path: 'transactions',component:TransactionUiComponent},
  { path: 'transaction', component: TransactionUiComponent },
  { path: 'askAgent', component: ChatUiComponent },
  { path: '', redirectTo: '/chat', pathMatch: 'full' }  // Default route
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
