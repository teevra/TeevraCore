/* Generated by Xgen from: E130.08.01 SIR 149794 on: 2010-02-12 15:07 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqEbiStratBlkTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire EBI Strategy Block Trade
*
*******************************************************************************/

#ifndef _INQEBISTRATBLKTRD_HXX_
#define _INQEBISTRATBLKTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_EBI_STRAT_BLK_TRD_RESP_GRP_MAX   30

/******************************************************************************/

#ifndef _BSC_INQ_EBI_STRAT_BLK_TRD_REQUEST_T_
#define _BSC_INQ_EBI_STRAT_BLK_TRD_REQUEST_T_

typedef struct bscInqEbiStratBlkTrdRequestTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
} bscInqEbiStratBlkTrdRequestT, *pBscInqEbiStratBlkTrdRequestT;

#endif  /* _BSC_INQ_EBI_STRAT_BLK_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_EBI_STRAT_BLK_TRD_REQUEST_T_
#define _INQ_EBI_STRAT_BLK_TRD_REQUEST_T_

typedef struct inqEbiStratBlkTrdRequestTag
{
    dataHeaderT      header;
    bscInqEbiStratBlkTrdRequestT basic;
} inqEbiStratBlkTrdRequestT, *pInqEbiStratBlkTrdRequestT;

#endif  /* _INQ_EBI_STRAT_BLK_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_EBI_STRAT_BLK_TRD_RESP_GRP_T_
#define _BSC_INQ_EBI_STRAT_BLK_TRD_RESP_GRP_T_

typedef struct bscInqEbiStratBlkTrdRespGrpTag
{
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
    char             ctpySubGrpCod   [CTPY_SUB_GRP_COD_LEN];
    char             buyCod;
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             opnClsCod;
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             ebiTrdApprInd;
} bscInqEbiStratBlkTrdRespGrpT, *pBscInqEbiStratBlkTrdRespGrpT;

#endif  /* _BSC_INQ_EBI_STRAT_BLK_TRD_RESP_GRP_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_EBI_STRAT_BLK_TRD_RESPONSE_T_
#define _BSC_INQ_EBI_STRAT_BLK_TRD_RESPONSE_T_

typedef struct bscInqEbiStratBlkTrdResponseTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
    trdrIdGrpT       trdrIdGrp;
    char             ebiBrokIdCod    [EBI_BROK_ID_COD_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    stratIdGrpT      stratIdGrp;
    stratEquLegGrpT  stratEquLegGrp;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqEbiStratBlkTrdRespGrpT bscInqEbiStratBlkTrdRespGrp [BSC_INQ_EBI_STRAT_BLK_TRD_RESP_GRP_MAX];
} bscInqEbiStratBlkTrdResponseT, *pBscInqEbiStratBlkTrdResponseT;

#endif  /* _BSC_INQ_EBI_STRAT_BLK_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_EBI_STRAT_BLK_TRD_RESPONSE_T_
#define _INQ_EBI_STRAT_BLK_TRD_RESPONSE_T_

typedef struct inqEbiStratBlkTrdResponseTag
{
    dataHeaderT      header;
    bscInqEbiStratBlkTrdResponseT basic;
} inqEbiStratBlkTrdResponseT, *pInqEbiStratBlkTrdResponseT;

#endif  /* _INQ_EBI_STRAT_BLK_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQEBISTRATBLKTRD_HXX_ */

/******************************************************************************/
/* End of file InqEbiStratBlkTrd.hxx */
/******************************************************************************/
