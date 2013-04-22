/* Generated by Xgen from: E120.27.02 SIR 134649 on: 2009-06-30 17:11 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqAllStratTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire All Strategy Trades
*
*******************************************************************************/

#ifndef _INQALLSTRATTRD_HXX_
#define _INQALLSTRATTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_ALL_STRAT_TRD_REC_MAX            10

/******************************************************************************/

#ifndef _BSC_INQ_ALL_STRAT_TRD_REQUEST_T_
#define _BSC_INQ_ALL_STRAT_TRD_REQUEST_T_

typedef struct bscInqAllStratTrdRequestTag
{
    char             prodId          [PROD_ID_LEN];
    char             stratTyp        [STRAT_TYP_LEN];
    char             trdOrigTyp;
    char             trdTyp;
    char             trnDat          [DRIV_DATE_LEN];
    char             timMin          [DRIV_TIME_LEN];
    char             timMax          [DRIV_TIME_LEN];
    char             trdEvntSeqNoMin [TRD_EVNT_TRN_ID_MIN_LEN];
    char             trdEvntSeqNoMax [TRD_EVNT_TRN_ID_MAX_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} bscInqAllStratTrdRequestT, *pBscInqAllStratTrdRequestT;

#endif  /* _BSC_INQ_ALL_STRAT_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_ALL_STRAT_TRD_REQUEST_T_
#define _INQ_ALL_STRAT_TRD_REQUEST_T_

typedef struct inqAllStratTrdRequestTag
{
    dataHeaderT      header;
    bscInqAllStratTrdRequestT basic;
} inqAllStratTrdRequestT, *pInqAllStratTrdRequestT;

#endif  /* _INQ_ALL_STRAT_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_ALL_STRAT_TRD_REC_T_
#define _BSC_INQ_ALL_STRAT_TRD_REC_T_

typedef struct bscInqAllStratTrdRecTag
{
    stratIdGrpT      stratIdGrp;
    stratEquLegGrpT  stratEquLegGrp;
    char             trdEvntSeqNo    [TRD_EVNT_TRN_ID_LEN];
    char             trdPrcTyp;
    char             revsInd;
    char             trdQty          [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             trnDat          [DRIV_DATE_LEN];
    char             trnTim          [DRIV_TIME_LEN];
    char             noOfBuy         [NO_OF_BUY_LEN];
    char             noOfSel         [NO_OF_SEL_LEN];
    char             agrsrSidCod;
    char             totTrdQty       [DRIV_QUANTITY_LEN];
    char             trdTyp;
    char             trnIdNo1        [TRN_ID_NO_LEN];
    char             trnIdNo2        [TRN_ID_NO_LEN];
    char             trnIdNo3        [TRN_ID_NO_LEN];
    char             trnIdNo4        [TRN_ID_NO_LEN];
} bscInqAllStratTrdRecT, *pBscInqAllStratTrdRecT;

#endif  /* _BSC_INQ_ALL_STRAT_TRD_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_ALL_STRAT_TRD_RESPONSE_T_
#define _BSC_INQ_ALL_STRAT_TRD_RESPONSE_T_

typedef struct bscInqAllStratTrdResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqAllStratTrdRecT bscInqAllStratTrdRec [BSC_INQ_ALL_STRAT_TRD_REC_MAX];
} bscInqAllStratTrdResponseT, *pBscInqAllStratTrdResponseT;

#endif  /* _BSC_INQ_ALL_STRAT_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_ALL_STRAT_TRD_RESPONSE_T_
#define _INQ_ALL_STRAT_TRD_RESPONSE_T_

typedef struct inqAllStratTrdResponseTag
{
    dataHeaderT      header;
    bscInqAllStratTrdResponseT basic;
} inqAllStratTrdResponseT, *pInqAllStratTrdResponseT;

#endif  /* _INQ_ALL_STRAT_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQALLSTRATTRD_HXX_ */

/******************************************************************************/
/* End of file InqAllStratTrd.hxx */
/******************************************************************************/
