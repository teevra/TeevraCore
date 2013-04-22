/* Generated by Xgen from: E120.34.01 SIR 138391 on: 2009-08-20 11:31 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DRIV_app_rid.h
*
*  DESCRIPTION: Definition of Application Request ID (RID) constants
*
*******************************************************************************/

#ifndef _DRIV_APP_RID_H_
#define _DRIV_APP_RID_H_

#define DRIV_ENTER_SINGLE_LEG_CROSS_REQUEST_RID                  101
#define DRIV_ENTER_DOUBLE_LEG_CROSS_REQUEST_RID                  102
#define DRIV_INQUIRE_CONTRACT_LIST_RID                           103
#define DRIV_INQUIRE_SECOND_LEG_CONTRACT_LIST_RID                104
#define DRIV_INQUIRE_CONTRACT_RID                                105
#define DRIV_INQUIRE_SETTLEMENT_PRICE_RID                        106
#define DRIV_INQUIRE_PRODUCT_LIST_RID                            107
#define DRIV_INQUIRE_PRODUCT_RID                                 108
#define DRIV_INQUIRE_PRODUCT_STATE_RID                           109
#define DRIV_INQUIRE_UNDERLYING_LIST_RID                         110
#define DRIV_INQUIRE_SINGLE_LEG_INSIDE_MARKET_RID                111
#define DRIV_INQUIRE_DOUBLE_LEG_INSIDE_MARKET_RID                112
#define DRIV_INQUIRE_SINGLE_LEG_ORDERBOOK_DEPTH_RID              113
#define DRIV_INQUIRE_DOUBLE_LEG_ORDERBOOK_DEPTH_RID              114
#define DRIV_INQUIRE_BO_INFORMATION_RID                          115
#define DRIV_INQUIRE_TICKER_RID                                  116
#define DRIV_INQUIRE_MARKET_NEWS_LIST_RID                        117
#define DRIV_INQUIRE_MARKET_NEWS_RID                             118
#define DRIV_ENTER_SINGLE_LEG_ORDER_RID                          119
#define DRIV_MODIFY_SINGLE_LEG_ORDER_RID                         120
#define DRIV_DELETE_SINGLE_LEG_ORDER_RID                         121
#define DRIV_INQUIRE_OWN_SINGLE_LEG_ORDER_RID                    122
#define DRIV_ENTER_DOUBLE_LEG_ORDER_RID                          123
#define DRIV_MODIFY_DOUBLE_LEG_ORDER_RID                         124
#define DRIV_DELETE_DOUBLE_LEG_ORDER_RID                         125
#define DRIV_INQUIRE_OWN_DOUBLE_LEG_ORDER_RID                    126
#define DRIV_DELETE_SINGLE_LEG_MASS_ORDER_RID                    127
#define DRIV_DELETE_DOUBLE_LEG_MASS_ORDER_RID                    128
#define DRIV_ENTER_BLOCK_TRADE_RID                               135
#define DRIV_MODIFY_BLOCK_TRADE_RID                              136
#define DRIV_APPROVE_BLOCK_TRADE_RID                             137
#define DRIV_DELETE_BLOCK_TRADE_RID                              138
#define DRIV_INQUIRE_BLOCK_TRADE_RID                             139
#define DRIV_ENTER_SINGLE_LEG_QUOTE_RID                          140
#define DRIV_DELETE_SINGLE_LEG_QUOTE_RID                         141
#define DRIV_INQUIRE_OWN_SINGLE_LEG_QUOTE_RID                    142
#define DRIV_ENTER_DOUBLE_LEG_QUOTE_RID                          143
#define DRIV_DELETE_DOUBLE_LEG_QUOTE_RID                         144
#define DRIV_INQUIRE_OWN_DOUBLE_LEG_QUOTE_RID                    145
#define DRIV_ENTER_MASS_QUOTE_RID                                146
#define DRIV_DELETE_MASS_QUOTE_RID                               149
#define DRIV_ENTER_SINGLE_LEG_QUOTE_REQUEST_RID                  150
#define DRIV_ENTER_DOUBLE_LEG_QUOTE_REQUEST_RID                  151
#define DRIV_INQUIRE_HIST_POSITION_TRANSACTIONS_RID              152
#define DRIV_INQUIRE_EXTERNAL_CONTRACT_RID                       153
#define DRIV_INQUIRE_ALL_SINGLE_LEG_TRADES_RID                   154
#define DRIV_INQUIRE_ALL_STRATEGY_TRADES_RID                     155
#define DRIV_REQUEST_BROADCAST_RE_TRANSMISSION_RID               165
#define DRIV_CHANGE_PASSWORD_RID                                 167
#define DRIV_INQUIRE_DATE_RID                                    170
#define DRIV_INQUIRE_OWN_TRADE_RID                               173
#define DRIV_INQUIRE_ALL_TRADES_RID                              175
#define DRIV_ENTER_TRADE_SEPARATION_RID                          176
#define DRIV_ENTER_TRADE_OPEN_CLOSE_ADJUSTMENT_RID               177
#define DRIV_ENTER_TRADE_ACCOUNT_TRANSFER_RID                    178
#define DRIV_ENTER_HISTORICAL_TRADE_TRANSFER_RID                 179
#define DRIV_INQUIRE_POSITION_DETAIL_RID                         180
#define DRIV_ENTER_POSITION_CLOSE_ADJUSTMENT_RID                 181
#define DRIV_INQUIRE_ZERO_COST_QUANTITIES_RID                    182
#define DRIV_ENTER_POSITION_ACCOUNT_TRANSFER_RID                 183
#define DRIV_INQUIRE_POSITION_RID                                184
#define DRIV_ENTER_POSITION_MEMBER_TRANSFER_RID                  185
#define DRIV_DELETE_POSITION_MEMBER_TRANSFER_RID                 186
#define DRIV_ACCEPT_POSITION_MEMBER_TRANSFER_RID                 187
#define DRIV_INQUIRE_POSITION_MEMBER_TRANSFER_RID                188
#define DRIV_ENTER_GIVE_UP_TRANSACTION_RID                       189
#define DRIV_ENTER_GIVE_UP_ORDER_RID                             190
#define DRIV_MODIFY_GIVE_UP_TRANSACTION_RID                      191
#define DRIV_MODIFY_GIVE_UP_ORDER_RID                            192
#define DRIV_ACCEPT_GIVE_UP_TRANSACTION_RID                      193
#define DRIV_ACCEPT_GIVE_UP_ORDER_RID                            194
#define DRIV_UNDESIGNATE_GIVE_UP_TRANSACTION_RID                 195
#define DRIV_UNDESIGNATE_GIVE_UP_ORDER_RID                       196
#define DRIV_DELETE_GIVE_UP_ORDER_RID                            197
#define DRIV_DELETE_GIVE_UP_TRANSACTION_RID                      198
#define DRIV_INQUIRE_GIVE_UP_RID                                 199
#define DRIV_ENTER_TAKE_UP_TRANSACTION_RID                       200
#define DRIV_ENTER_TAKE_UP_ORDER_RID                             201
#define DRIV_ACCEPT_TAKE_UP_TRANSACTION_RID                      202
#define DRIV_ACCEPT_TAKE_UP_ORDER_RID                            203
#define DRIV_REJECT_TAKE_UP_TRANSACTION_RID                      204
#define DRIV_REJECT_TAKE_UP_ORDER_RID                            205
#define DRIV_INQUIRE_TAKE_UP_RID                                 206
#define DRIV_ENTER_EXERCISE_RID                                  207
#define DRIV_INQUIRE_EXERCISE_RID                                208
#define DRIV_INQUIRE_EXERCISE_ASSIGNMENT_RID                     209
#define DRIV_ENTER_NOTIFICATION_RID                              210
#define DRIV_INQUIRE_NOTIFICATION_RID                            211
#define DRIV_INQUIRE_NOTIFICATION_DETAIL_RID                     212
#define DRIV_INQUIRE_NOTIFICATION_ALLOCATION_RID                 213
#define DRIV_INQUIRE_MEMBER_LIST_RID                             215
#define DRIV_INQUIRE_NCM_LIST_RID                                216
#define DRIV_INQUIRE_ASSIGNMENT_STATUS_RID                       217
#define DRIV_ENTER_EFP_TRADE_RID                                 218
#define DRIV_MODIFY_EFP_TRADE_RID                                219
#define DRIV_APPROVE_EFP_TRADE_RID                               220
#define DRIV_DELETE_EFP_TRADE_RID                                221
#define DRIV_INQUIRE_EFP_TRADE_RID                               222
#define DRIV_INQUIRE_RECOV_BROADCAST_STATUS_RID                  223
#define DRIV_RESET_PASSWORD_RID                                  224
#define DRIV_INQUIRE_SINGLE_TRADE_RID                            225
#define DRIV_INQUIRE_VOLA_TRADE_RID                              226
#define DRIV_ENTER_VOLA_TRADE_RID                                227
#define DRIV_MODIFY_VOLA_TRADE_RID                               228
#define DRIV_APPROVE_VOLA_TRADE_RID                              229
#define DRIV_DELETE_VOLA_TRADE_RID                               230
#define DRIV_INQUIRE_ALLOCATION_RID                              231
#define DRIV_INQUIRE_DELIVERABLE_POSITION_RID                    232
#define DRIV_INQUIRE_PRODUCT_STATISTICS_RID                      233
#define DRIV_INQUIRE_SECURITY_MOVEMENT_RID                       237
#define DRIV_INQUIRE_EXCHANGE_RATE_RID                           238
#define DRIV_INQUIRE_ASSIGNMENT_RID                              239
#define DRIV_INQUIRE_DAILY_MARGIN_RID                            240
#define DRIV_INQUIRE_MARGINED_POSITION_RID                       241
#define DRIV_INQUIRE_GUARANTEE_POSITION_RID                      242
#define DRIV_INQUIRE_CONTRACT_STATISTICS_RID                     245
#define DRIV_MODIFY_USER_PRODUCT_ASSIGNMENT_RID                  248
#define DRIV_ENTER_USER_PRODUCT_ASSIGNMENT_RID                   249
#define DRIV_DELETE_USER_PRODUCT_ASSIGNMENT_RID                  250
#define DRIV_ENTER_PRODUCT_SUBGROUP_ASSIGNMENT_RID               251
#define DRIV_COPY_USER_PRODUCT_ASSIGNMENT_RID                    252
#define DRIV_INQUIRE_USER_SECURITY_PROFILE_RID                   254
#define DRIV_MODIFY_USER_SECURITY_PROFILE_RID                    255
#define DRIV_DELETE_USER_SECURITY_PROFILE_RID                    256
#define DRIV_ENTER_HISTORICAL_REPORT_REQUEST_RID                 257
#define DRIV_INQUIRE_DELIVERABLE_BONDS_RID                       261
#define DRIV_INQUIRE_FEE_ADJUSTMENT_RID                          262
#define DRIV_INQUIRE_MEMBER_INFORMATION_RID                      263
#define DRIV_INQUIRE_MEMBER_RELATION_RID                         264
#define DRIV_INQUIRE_OPTION_MARGIN_PARAMETERS_RID                266
#define DRIV_INQUIRE_REPORT_SELECTION_RID                        268
#define DRIV_MODIFY_MEMBER_RELATION_RID                          270
#define DRIV_MODIFY_REPORT_SELECTION_RID                         271
#define DRIV_MODIFY_AUTOMATIC_EXERCISE_PARAMETERS_RID            272
#define DRIV_INQUIRE_AUTOMATIC_EXERCISE_PARAMETERS_RID           273
#define DRIV_ENTER_AUTOMATIC_EXERCISE_ABANDON_RID                274
#define DRIV_INQUIRE_CSD_DETAIL_RID                              275
#define DRIV_INQUIRE_CSD_LIST_RID                                276
#define DRIV_INQUIRE_EXCHANGE_LIST_RID                           283
#define DRIV_INQUIRE_MEMBER_SECURITY_PROFILE_RID                 284
#define DRIV_ENTER_STRATEGY_REQUEST_RID                          291
#define DRIV_ENTER_STRATEGY_ORDER_RID                            292
#define DRIV_MODIFY_STRATEGY_ORDER_RID                           293
#define DRIV_DELETE_STRATEGY_ORDER_RID                           294
#define DRIV_ENTER_STRATEGY_QUOTE_RID                            295
#define DRIV_DELETE_STRATEGY_QUOTE_RID                           296
#define DRIV_INQUIRE_STRATEGY_INSIDE_MARKET_RID                  297
#define DRIV_INQUIRE_OWN_STRATEGY_ORDER_RID                      298
#define DRIV_INQUIRE_STRATEGY_THEORETICAL_PRICE_RID              299
#define DRIV_INQUIRE_OWN_STRATEGY_QUOTE_RID                      300
#define DRIV_ENTER_STRATEGY_OTC_BLOCK_TRADE_RID                  301
#define DRIV_MODIFY_STRATEGY_OTC_BLOCK_TRADE_RID                 302
#define DRIV_APPROVE_STRATEGY_OTC_BLOCK_TRADE_RID                303
#define DRIV_DELETE_STRATEGY_OTC_BLOCK_TRADE_RID                 304
#define DRIV_INQUIRE_STRATEGY_OTC_BLOCK_TRADE_RID                305
#define DRIV_ENTER_STRATEGY_CROSS_REQUEST_RID                    306
#define DRIV_INQUIRE_STRATEGY_ORDER_BOOK_DEPTH_RID               307
#define DRIV_ENTER_EFP_FIN_TRADE_RID                             308
#define DRIV_MODIFY_EFP_FIN_TRADE_RID                            309
#define DRIV_APPROVE_EFP_FIN_TRADE_RID                           310
#define DRIV_DELETE_EFP_FIN_TRADE_RID                            311
#define DRIV_INQUIRE_EFP_FIN_TRADE_RID                           312
#define DRIV_ENTER_EFS_TRADE_RID                                 313
#define DRIV_MODIFY_EFS_TRADE_RID                                314
#define DRIV_APPROVE_EFS_TRADE_RID                               315
#define DRIV_DELETE_EFS_TRADE_RID                                316
#define DRIV_INQUIRE_EFS_TRADE_RID                               317
#define DRIV_ENTER_EFP_IDX_TRADE_RID                             318
#define DRIV_MODIFY_EFP_IDX_TRADE_RID                            319
#define DRIV_APPROVE_EFP_IDX_TRADE_RID                           320
#define DRIV_DELETE_EFP_IDX_TRADE_RID                            321
#define DRIV_INQUIRE_EFP_IDX_TRADE_RID                           322
#define DRIV_INQUIRE_USER_LIST_RID                               324
#define DRIV_ENTER_FLEXIBLE_CONTRACT_RID                         325
#define DRIV_MODIFY_FLEXIBLE_CONTRACT_RID                        326
#define DRIV_DELETE_FLEXIBLE_CONTRACT_RID                        327
#define DRIV_APPROVE_FLEXIBLE_CONTRACT_RID                       328
#define DRIV_INQUIRE_FLEXIBLE_CONTRACT_RID                       329
#define DRIV_ENTER_EXERCISE_FLEXIBLE_CONTRACT_RID                330
#define DRIV_ENTER_GIVE_UP_FLEXIBLE_CONTRACT_RID                 331
#define DRIV_ACCEPT_GIVE_UP_TAKE_UP_FLEXIBLE_CONTRACT_RID        332
#define DRIV_DELETE_GIVE_UP_FLEXIBLE_CONTRACT_RID                333
#define DRIV_ENTER_TAKE_UP_FLEXIBLE_CONTRACT_RID                 334
#define DRIV_MODIFY_MARKET_MAKER_QUOTE_LIMITS_RID                335
#define DRIV_START_HEART_BEAT_RID                                336
#define DRIV_STOP_HEART_BEAT_RID                                 337
#define DRIV_ENTER_HEART_BEAT_RID                                338
#define DRIV_INQUIRE_FLEXIBLE_CONTRACT_ITM_PRICE_RID             339
#define DRIV_INQUIRE_MARKET_MAKER_QUOTE_LIMITS_RID               340
#define DRIV_ENTER_SPECIFIC_EQUITY_COLLATERAL_RID                341
#define DRIV_INQUIRE_SPECIFIC_EQUITY_COLLATERAL_RID              342
#define DRIV_ENTER_BLOCK_AUCTION_REQUEST_RID                     343
#define DRIV_MODIFY_BLOCK_AUCTION_REQUEST_RID                    344
#define DRIV_DELETE_BLOCK_AUCTION_REQUEST_RID                    345
#define DRIV_ACCEPT_BLOCK_AUCTION_REQUEST_RID                    346
#define DRIV_ENTER_BLOCK_AUCTION_QUOTE_RID                       347
#define DRIV_DELETE_BLOCK_AUCTION_QUOTE_RID                      348
#define DRIV_INQUIRE_BLOCK_AUCTION_RID                           349
#define DRIV_INQUIRE_OWN_BLOCK_AUCTION_RID                       350
#define DRIV_ENTER_STRATEGY_BLOCK_AUCTION_REQUEST_RID            351
#define DRIV_MODIFY_STRATEGY_BLOCK_AUCTION_REQUEST_RID           352
#define DRIV_DELETE_STRATEGY_BLOCK_AUCTION_REQUEST_RID           353
#define DRIV_ACCEPT_STRATEGY_BLOCK_AUCTION_REQUEST_RID           354
#define DRIV_ENTER_STRATEGY_BLOCK_AUCTION_QUOTE_RID              355
#define DRIV_DELETE_STRATEGY_BLOCK_AUCTION_QUOTE_RID             356
#define DRIV_INQUIRE_STRATEGY_BLOCK_AUCTION_RID                  357
#define DRIV_INQUIRE_OWN_STRATEGY_BLOCK_AUCTION_RID              358
#define DRIV_ADJUST_FLEXIBLE_CONTRACT_TRADE_RID                  359
#define DRIV_INQUIRE_ALL_FLEXIBLE_CONTRACT_TRADES_RID            360
#define DRIV_ENTER_FLEXIBLE_CONTRACT_TRADE_SEPARATION_RID        361
#define DRIV_ENTER_FLEXIBLE_CONTRACT_CLOSE_OUT_RID               362
#define DRIV_INQUIRE_PRODUCT_GROUP_LIST_RID                      363
#define DRIV_INQUIRE_PRODUCT_GROUP_RID                           364
#define DRIV_INQUIRE_PRODUCT_GROUP_ASSIGNMENT_RID                365
#define DRIV_MODIFY_MEMBER_PRODUCT_GROUP_QUANTITIES_RID          366
#define DRIV_MODIFY_MEMBER_PRODUCT_QUANTITIES_RID                367
#define DRIV_MAINTAIN_USER_PRODUCT_GROUP_QUANTITIES_RID          368
#define DRIV_INQUIRE_PRODUCT_ASSIGNMENT_RID                      369
#define DRIV_ENTER_EBI_TRADE_RID                                 370
#define DRIV_MODIFY_EBI_TRADE_RID                                371
#define DRIV_DELETE_EBI_TRADE_RID                                372
#define DRIV_INQUIRE_EBI_TRADE_RID                               373
#define DRIV_DELETE_ALL_ORDERS_RID                               374
#define DRIV_MODIFY_PRE_TRADING_RISK_LIMITS_RID                  375
#define DRIV_INQUIRE_PRE_TRADING_RISK_LIMITS_RID                 377
#define DRIV_DELETE_ALL_QUOTES_RID                               378
#define DRIV_ENTER_MEMBER_STOP_RELEASE_RID                       379
#define DRIV_INQUIRE_CSD_ACCOUNT_RID                             381
#define DRIV_INQUIRE_COLLATERAL_SECURITY_RID                     382
#define DRIV_INQUIRE_COLLATERAL_TRANSACTION_RID                  383
#define DRIV_MODIFY_COLLATERAL_TRANSACTION_RID                   384
#define DRIV_ENTER_SECURITY_COLLATERAL_TRANSACTION_RID           385
#define DRIV_INQUIRE_CASH_TRANSACTION_RID                        386
#define DRIV_INQUIRE_MEMBER_PERMANENT_CASH_RID                   387
#define DRIV_MODIFY_MEMBER_PERMANENT_CASH_RID                    388
#define DRIV_INQUIRE_COLLATERAL_STATUS_RID                       389
#define DRIV_INQUIRE_ALL_DOUBLE_LEG_TRADES_RID                   390
#define DRIV_INQUIRE_THROTTLE_LIMITS_RID                         391
#define DRIV_INQUIRE_MARGIN_REQUIREMENT_INFORMATION_RID          392
#define DRIV_ENTER_EBI_EFP_FIN_TRADE_RID                         393
#define DRIV_ENTER_EBI_EFP_IDX_TRADE_RID                         483
#define DRIV_ENTER_EBI_EFS_TRADE_RID                             484
#define DRIV_MODIFY_EBI_EFP_FIN_TRADE_RID                        485
#define DRIV_MODIFY_EBI_EFP_IDX_TRADE_RID                        486
#define DRIV_MODIFY_EBI_EFS_TRADE_RID                            487
#define DRIV_INQUIRE_EBI_EFP_FIN_TRADE_RID                       488
#define DRIV_INQUIRE_EBI_EFP_IDX_TRADE_RID                       489
#define DRIV_INQUIRE_EBI_EFS_TRADE_RID                           490
#define DRIV_DELETE_EBI_EFP_FIN_TRADE_RID                        491
#define DRIV_DELETE_EBI_EFP_IDX_TRADE_RID                        492
#define DRIV_DELETE_EBI_EFS_TRADE_RID                            493
#define DRIV_ENTER_EBI_STRATEGY_BLOCK_TRADE_RID                  494
#define DRIV_MODIFY_EBI_STRATEGY_BLOCK_TRADE_RID                 495
#define DRIV_INQUIRE_EBI_STRATEGY_BLOCK_TRADE_RID                496
#define DRIV_DELETE_EBI_STRATEGY_BLOCK_TRADE_RID                 497
#define DRIV_INQUIRE_PIN_PROCEDURE_RID                           501
#define DRIV_MAINTAIN_PIN_PROC_RID                               502

#endif /* _DRIV_APP_RID_H_ */

/******************************************************************************/
/* End of file DRIV_app_rid.h */
/******************************************************************************/
